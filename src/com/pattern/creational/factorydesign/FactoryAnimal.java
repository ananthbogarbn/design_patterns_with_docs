package com.pattern.creational.factorydesign;

public class FactoryAnimal {

	public static void main(String[] args) {
		Animal animal = getInstance("cat");
		animal.sound();
	}
	
	public static Animal getInstance(String str) {
		if(str.equals("cat"))
			return new Cat();
		else if(str.equals("dog"))
			return new Dog();
		else
			return new Elephant();
	}
}
