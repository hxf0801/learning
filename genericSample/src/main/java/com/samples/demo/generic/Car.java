package com.samples.demo.generic;

public interface Car<T extends Car<?>> {
	T name(String name);
	
	void whoMakeIt();
}
