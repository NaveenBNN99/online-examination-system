package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subjects {
	@Id
	private int subjectid;
	private String subjectname;
	
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
	@Override
	public String toString() {
		return "Subjects [subjectid=" + subjectid + ", subjectname=" + subjectname + "]";
	}	
}