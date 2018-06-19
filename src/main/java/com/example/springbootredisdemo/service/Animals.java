package com.example.springbootredisdemo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Animals {

	@Cacheable(value="animals")
	public List<String> getAnimals() {
		log.debug("Lets get some animals");
		return Arrays.asList("lion", "peacock", "hen", "meerkut", "polar bear");
	}
}
