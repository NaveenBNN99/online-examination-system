package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answersheets")
public class AnswerSheets {
	@Id
	private int questionnumber;
	private int studentid;
	private int subjectid;
	private String response;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public int getQuestionnumber() {
		return questionnumber;
	}
	public void setQuestionnumber(int questionnumber) {
		this.questionnumber = questionnumber;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	@Override
	public String toString() {
		return "AnswerSheets [studentid=" + studentid + ", subjectid=" + subjectid + ", questionnumber="
				+ questionnumber + ", response=" + response + "]";
	}	
}