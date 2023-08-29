package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {
	
	@Id
	private int questionnumber;
	private int subjectid;
	private String question;

	public int getQuestionnumber() {
		return questionnumber;
	}

	public void setQuestionnumber(int questionnumber) {
		this.questionnumber = questionnumber;
	}

	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Questions [questionnumber=" + questionnumber + ", subjectid=" + subjectid + ", question=" + question
				+ "]";
	}
	
}