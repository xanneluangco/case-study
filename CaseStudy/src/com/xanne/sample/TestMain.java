package com.xanne.sample;

import com.xanne.util.DBConnection;

public class TestMain {

	public static void main(String[] args) {
		TestMain main = new TestMain();
		main.displayName(new Raymond());
		main.displayName(new Gary());
		main.displayName(new Sharon());
		}
	
	private void displayName(Person person) {
		person.printName();
	}
}
