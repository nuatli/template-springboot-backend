package com.natli.springboot.template.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.natli.springboot.template.course.jpa.CourseJpaRepository;
import com.natli.springboot.template.course.jpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	//private CourseJdbcRepository repository;
	//private CourseJpaRepository repository;
	private CourseSpringDataJpaRepository springDataRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		//repository.insert();
		/*
		repository.insert(new Course(1,"learn Aws", "in28minutes"));
		repository.insert(new Course(2,"learn Azure", "in28minutes"));
		repository.insert(new Course(3,"learn Dev Ops", "in28minutes"));
		
		repository.deleteById(2);
		
		System.out.println(repository.findById(1));
		*/
		
		springDataRepository.save(new Course(1,"learn Aws", "in28minutes"));
		springDataRepository.save(new Course(2,"learn Azure", "in28minutes"));
		springDataRepository.save(new Course(3,"learn Dev Ops", "in28minutes"));
		
		springDataRepository.deleteById(2l);
		
		System.out.println(springDataRepository.findById(1l));
		
		System.out.println(springDataRepository.findByAuthor("in28minutes"));
		System.out.println(springDataRepository.findByAuthor(""));
		
		System.out.println(springDataRepository.findByName("learn Aws"));
		System.out.println(springDataRepository.findByName(""));
		
		
		
	}

}
