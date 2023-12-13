package com.example.manytomany.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7378128306710288059L;
	@Id
	@GeneratedValue
	private int cId;
	private String title;
	private int modules;
	private double fee;
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Student> students;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getModules() {
		return modules;
	}
	public void setModules(int modules) {
		this.modules = modules;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", title=" + title + ", modules=" + modules + ", fee=" + fee + ", students="
				+ students + "]";
	}
	public Course(int cId, String title, int modules, double fee, List<Student> students) {
		super();
		this.cId = cId;
		this.title = title;
		this.modules = modules;
		this.fee = fee;
		this.students = students;
	}
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
}
