  package com.example.first.entity;

public class Student {
private String name;
private String email;
private String city;

public Student(String name, String email, String city) {

	this.name = name;
	this.email = email;
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
