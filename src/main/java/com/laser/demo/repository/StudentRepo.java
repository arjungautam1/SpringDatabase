package com.laser.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laser.demo.entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Long>{

}
