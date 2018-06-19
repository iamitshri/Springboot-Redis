package com.example.springbootredisdemo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootredisdemo.domain.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, String> {

}
