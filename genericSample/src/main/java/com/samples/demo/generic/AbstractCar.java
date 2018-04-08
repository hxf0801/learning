package com.samples.demo.generic;

public abstract class AbstractCar<T extends AbstractCar<?>> implements Car<T> {
	private String name;

	@SuppressWarnings("unchecked")
	@Override
	public T name(String name) {
		this.name = name;
		return (T) this;
	}

	@Override
	public void whoMakeIt() {
		throw new RuntimeException("please find out someone to answer it");
	}

	public String getName() {
		return name;
	}

}
