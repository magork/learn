package com.test.learn;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@EnableConfigurationProperties
@SpringBootApplication
@ComponentScan
public class LearnApplication {

	// @Bean
	// public Person giveMeAPerson(){
	// 	return new Person("Gyula", 20);
	// }

	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(LearnApplication.class, args);
		System.out.println(ct.getBean("person"));




	}

}
