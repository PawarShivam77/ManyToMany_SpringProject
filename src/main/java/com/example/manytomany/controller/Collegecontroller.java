package com.example.manytomany.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytomany.entity.Student;
import com.example.manytomany.repo.StudentRepository;
import com.example.manytomany.repo.courseRepository;

@RestController
@RequestMapping("/student")
public class Collegecontroller {
	private static final Logger log = LoggerFactory.getLogger(Collegecontroller.class);
	@Autowired
	private StudentRepository sRepo;
	@Autowired
	private courseRepository cRepo;

	@PostMapping("/add")
	public Student addStudentWithCourse(@RequestBody Student student) {
		log.info("addStudentWithCourse method executed....");
		return sRepo.save(student);
	}
@GetMapping("/getAll")
	public  List<Student> getAllStudentWithCourses(){
		log.info("getAllStudentWithCourses executed.....");
	return sRepo.findAll();
	}
	
}
