package com.example.springbootredisdemo.controller;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootredisdemo.domain.Student;
import com.example.springbootredisdemo.repo.StudentRepo;
import com.example.springbootredisdemo.service.Animals;

@RestController
@RequestMapping("/v1/")
public class AnimalController {

	@Autowired
	Animals animalSvc;
	
	@Autowired
	StudentRepo repo;

	@GetMapping("/animal")
	public List<String> getAnimals() {
		 System.out.println("Controller::START ");
		 List<String> strs = animalSvc.getAnimals();
		 System.out.println("Controller::END ");
		 return strs ;
	}
	
	@PostMapping("/student")
	public  Student saveStudent(@RequestBody Student stud) {
		return repo.save(stud);
	}
}
