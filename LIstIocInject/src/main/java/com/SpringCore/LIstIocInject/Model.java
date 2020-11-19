package com.SpringCore.LIstIocInject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Model {
private String name;
private List<String> phonesnumber;
private Set<String> address;
private Map<String,String> course;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhonesnumber() {
	return phonesnumber;
}
public void setPhonesnumber(List<String> phonesnumber) {
	this.phonesnumber = phonesnumber;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}
@Override
public String toString() {
	return "Model [name=" + name + ", phonesnumber=" + phonesnumber + ", address=" + address + ", course=" + course
			+ "]";
}

}
