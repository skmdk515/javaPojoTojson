package com.example.first.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.entity.Student;
@RestController
public class StudentController {
	@GetMapping("/student")
public List<Student> getStudent(){
	ArrayList<Student>studentlist=new ArrayList<Student>();
	studentlist.add(new Student("mohammad","skmdk515@gmail.com","Hyderabad"));
	studentlist.add(new Student("siva","siva@gmail.com","nellore"));
	studentlist.add(new Student("naresh","naresh@gmail.com","Hyderabad"));
	return studentlist;
	
}
}
 