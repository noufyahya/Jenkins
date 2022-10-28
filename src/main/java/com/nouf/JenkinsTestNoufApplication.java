package com.nouf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("hi")
public class JenkinsTestNoufApplication {

	@GetMapping
	public String hello() {
		return "Welcome TO Jenkins";
	}

	@GetMapping("/{name}")
	public String helloName(@PathVariable String name) {
		return "Welcome" +name;
	}
	public static void main(String[] args) {
		System.out.println("hi");
		SpringApplication.run(JenkinsTestNoufApplication.class, args);
	}

}
