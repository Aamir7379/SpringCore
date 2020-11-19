package com.jsoft.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
private String name;
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public Address(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [name=" + name + ", password=" + password + "]";
}

}
