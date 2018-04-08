package com.example.demo.dynamicbeans;

class DynamicBeanExample {
	private final String beanId;
	private final TestDependency testDependency;

	public DynamicBeanExample(String beanId, TestDependency testDependency) {
		super();
		this.beanId = beanId;
		this.testDependency = testDependency;
	}
	public String hello() {
		return "hello from " + beanId + " with dependency " + testDependency.hello();
	}
}
