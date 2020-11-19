package com.jsoft;

public class Student {
private int studentid;
private String studentname;
private String studentcollege;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentcollege() {
	return studentcollege;
}
public void setStudentcollege(String studentcollege) {
	this.studentcollege = studentcollege;
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentcollege=" + studentcollege
			+ "]";
}


}
