package com.producer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.model.Student;

@RestController
public class ProducerController {

	@RequestMapping("/getalldata")
	public List<Student> producerData() {
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Rohit");
		s1.setUname("rohitf");
		s1.setPass("rohitf");
		
		List<Student> list=new ArrayList<>();
		list.add(s1);
		return list;
		
	}

}
