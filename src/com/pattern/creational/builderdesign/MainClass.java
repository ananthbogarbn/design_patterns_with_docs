package com.pattern.creational.builderdesign;

public class MainClass {

	public static void main(String[] args) {
		Animal animalBuilder = new AnimalBuilder().setFoodType("Herbivorous").setName("Elephant").setLifeSpan(70).getAnimal();
		System.out.println(animalBuilder);
	}
	
}
