package com.microservice.student.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.student.entities.Student;
import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long>{
    List<Student> findAllByCourseId(Long idCourse);
}
