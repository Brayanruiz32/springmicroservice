package com.microservice.course.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservice.course.entities.Course;

public interface ICourseRepository extends JpaRepository<Course, Long>{

}
