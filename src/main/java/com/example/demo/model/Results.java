package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Results implements Serializable{
	@Id
	private int studentid;
	private int subjectid;
	private int result;
	
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
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "Results [studentid=" + studentid + ", subjectid=" + subjectid + ", result=" + result + "]";
	}
}
