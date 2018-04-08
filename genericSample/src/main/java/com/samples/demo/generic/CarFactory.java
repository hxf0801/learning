package com.samples.demo.generic;

public interface CarFactory<F extends CarFactory<?,?>, C extends Car<?>> {
	C getCar();
}
