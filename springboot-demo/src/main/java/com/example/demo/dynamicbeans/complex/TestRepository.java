package com.example.demo.dynamicbeans.complex;

class TestRepository {
	private final String instanceId;

	public TestRepository(String instanceId) {
		super();
		this.instanceId = instanceId;
	}

	String hello() {
		return instanceId;
	}
}
