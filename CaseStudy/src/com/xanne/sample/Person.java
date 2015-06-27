package com.xanne.sample;

public abstract class Person {
	
	public void printName() {
		System.out.println("My name is " + getName());
	}
	
	protected abstract String getName();
}
