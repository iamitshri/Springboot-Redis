package com.example.springbootredisdemo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Animals {

	@Cacheable(value = "animalNames")
	public List<String> getAnimals() {
		System.out.println("This is un-cached");
		return Arrays.asList("lion", "peacock", "hen", "meerkut", "polar bear");
	}
}
