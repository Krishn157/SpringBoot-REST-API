package com.krishn.demo.dao;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.krishn.demo.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
