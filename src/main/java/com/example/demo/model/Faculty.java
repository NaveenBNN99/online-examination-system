package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
@Id
  private int facultyid;
  private String fusername;
  private String fpassword;
  private String facultyname;
  private String department;
public String getFusername() {
	return fusername;
}
public void setFusername(String fusername) {
	this.fusername = fusername;
}
public String getFpassword() {
	return fpassword;
}
public void setFpassword(String fpassword) {
	this.fpassword = fpassword;
}
public int getFacultyid() {
	return facultyid;
}
public void setFacultyid(int facultyid) {
	this.facultyid = facultyid;
}
public String getFacultyname() {
	return facultyname;
}
public void setFacultyname(String facultyname) {
	this.facultyname = facultyname;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
}
