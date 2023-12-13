package com.example.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.entity.Course;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface courseRepository extends JpaRepository<Course, Integer>{

}
