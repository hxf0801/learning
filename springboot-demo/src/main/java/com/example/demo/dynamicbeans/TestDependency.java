package com.example.demo.dynamicbeans;

import org.springframework.stereotype.Component;

@Component
class TestDependency {
	public String hello() {
		return "test dependency";
	}
}
