package com.example.manytomany.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4470093230227818074L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String dept;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable (name="STUDENT_COURSE", joinColumns = {
			@JoinColumn(name="student_id", referencedColumnName = "id")
	},  inverseJoinColumns = {@JoinColumn(name="course_id", referencedColumnName = "cId")} )
	@JsonManagedReference	
	private List<Course> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + ", courses=" + courses
				+ "]";
	}
	public Student(int id, String name, int age, String dept, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.courses = courses;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
