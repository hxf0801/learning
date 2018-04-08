package com.example.demo.dynamicbeans.complex;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class TestService {
	private final Collection<TestRepository> allRepositories;

	public TestService(Collection<TestRepository> allRepositories) {
		super();
		this.allRepositories = allRepositories;
	}

	public String hello() {
		return "service with " + allRepositories.stream()
				.map(TestRepository::hello)
				.collect(Collectors.joining(","));
	}
}
