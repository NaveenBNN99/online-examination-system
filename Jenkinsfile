pipeline {
    agent any
    
    environment {
        AWS_DEFAULT_REGION = 'us-east-1'
        AWS_ACCESS_KEY_ID = credentials('Access-key') 
        AWS_SECRET_ACCESS_KEY = credentials('Secret-key')
        IMAGE_REPO_NAME = "online-exam"
        IMAGE_TAG = "latest"
        REPOSITORY_URI = "494043708686.dkr.ecr.us-east-1.amazonaws.com/online-exam"
    }
    
    stages {
        stage('Authenticate and Deploy') {
            steps {
                script {
                    
                    def ecrAuthToken = sh(script: "aws ecr get-login-password --region ${AWS_DEFAULT_REGION}", returnStdout: true).trim()
                    
                    
                    sh "docker login -u AWS -p ${ecrAuthToken} 494043708686.dkr.ecr.us-east-1.amazonaws.com/online-exam"
                    
                    // Continue with your deployment steps
                    // ...
                }
            }
        }
        
        stage('Cloning Git') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NaveenBNN99/online-examination-system.git']])
            }
        }
        
        stage('Build with Gradle') {
            steps {
                script {
                    sh 'sudo chmod +x ./gradlew'
                    sh './gradlew clean build'
                }
            }
        }
        
        stage('Building image') {
            steps {
                script {
                    dockerImage = docker.build "${IMAGE_REPO_NAME}:${IMAGE_TAG}"
                }
            }
        }
        
        stage('Pushing to ECR') {
            steps {
                script {
                    sh "docker tag ${IMAGE_REPO_NAME}:${IMAGE_TAG} ${REPOSITORY_URI}:${IMAGE_TAG}"
                    sh "docker push ${REPOSITORY_URI}:${IMAGE_TAG}"
                }
            }
        }

        stage('Install kubectl') {
            steps {
                script {
                    def kubectlDir = "/usr/local/bin/"  // Replace with the actual path
                    env.PATH = "${kubectlDir}:${env.PATH}"
                }
            }
        }
        
        stage('Terraform Init') {
            steps {
                script {
                    sh 'terraform init'
                }
            }
        }
        
        stage('Terraform Plan') {
            steps {
                script {
                    // Run Terraform plan
                    sh 'terraform plan -out=tfplan'
                    archiveArtifacts artifacts: 'tfplan', allowEmptyArchive: true
                }
            }
        }

        stage('Terraform Apply') {
            steps {
                script {
                    // Run Terraform apply
                    sh 'terraform apply -auto-approve tfplan'
                }
            }
        }

        stage("Deploy to EKS") {
            steps {
                script {
                    echo "Current PATH: ${env.PATH}"
                    sh "aws eks update-kubeconfig --name myapp-eks-cluster"
                    sh "kubectl apply -f deployment.yaml"
                }
            }
        }
    }

    post {
        always {
            input message: 'Terraform? (Click "Proceed" to destroy)', ok: 'Proceed'
            sh 'terraform destroy -auto-approve'
        }
    }
}
