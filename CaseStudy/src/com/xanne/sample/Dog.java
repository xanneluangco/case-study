package com.xanne.sample;

public abstract class Dog implements Animal {

	@Override
	public void doEat() {
		System.out.println("eat me");
	}

	public void display() {
		doEat();
		doSleep();
	}
}
