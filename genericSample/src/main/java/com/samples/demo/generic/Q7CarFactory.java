package com.samples.demo.generic;

public class Q7CarFactory implements CarFactory<Q7CarFactory, Q7> {
	@Override
	public Q7 getCar() {
		return new Q7().name("Q7");
	}

}
