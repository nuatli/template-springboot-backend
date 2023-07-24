package com.natli.springboot.template.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//repository.insert();
		
		repository.insert(new Course(1,"learn Aws", "in28minutes"));
		repository.insert(new Course(2,"learn Azure", "in28minutes"));
		repository.insert(new Course(3,"learn Dev Ops", "in28minutes"));
		
		repository.deleteById(2);
		
		System.out.println(repository.findById(1));
		
	}

}
