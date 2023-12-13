package com.example.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.entity.Student;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
