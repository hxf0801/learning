package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);
		
		String[] names=applicationContext.getBeanDefinitionNames();
		for(String name:names) {
			System.out.println(name);
		}
		/*
		 * Dynamically register implementation class via their full-qualified class
		 * name. and later get their instance to use
		 */
		//use registered bean name to get instance
		TextBook textBook = applicationContext.getBean("com.example.demo.TextBook", TextBook.class);
		Map<String, String> map = new HashMap<String, String>();
		map.put("author", "Tom");
		textBook.setMap(map);
		System.out.println(textBook + ":" + textBook.getType());

		textBook = applicationContext.getBean("com.example.demo.TextBook", TextBook.class);
		map = new HashMap<String, String>();
		map.put("age", "35");
		map.put("publish", "2017");
		textBook.setMap(map);
		System.out.println(textBook + ":" + textBook.getType());
		
		// demo to use class type to get implementation class instance
		Novel novel = applicationContext.getBean(Novel.class);
		System.out.println(novel + ":" + novel.getType());
		//get another one. to check if they are same instance
		novel = applicationContext.getBean(Novel.class);
		System.out.println(novel + ":" + novel.getType());
	}
}
