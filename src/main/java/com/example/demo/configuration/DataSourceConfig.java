package com.example.demo.configuration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .url("jdbc:postgresql://online-exam.cswc818y3x3o.us-east-1.rds.amazonaws.com:5432/onlineexam")
                .username("postgres")
                .password("admin123")
                .driverClassName("org.postgresql.Driver")
                .build();
    }
}
