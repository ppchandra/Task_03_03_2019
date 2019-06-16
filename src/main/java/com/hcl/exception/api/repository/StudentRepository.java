package com.hcl.exception.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.exception.api.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
