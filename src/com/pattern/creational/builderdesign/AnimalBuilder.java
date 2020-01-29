package com.pattern.creational.builderdesign;

public class AnimalBuilder {

	private String name;
	private String habitat;
	private String foodType;
	private String sound;
	private int lifeSpan;

	public AnimalBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public AnimalBuilder setHabitat(String habitat) {
		this.habitat = habitat;
		return this;
	}

	public AnimalBuilder setFoodType(String foodType) {
		this.foodType = foodType;
		return this;
	}

	public AnimalBuilder setSound(String sound) {
		this.sound = sound;
		return this;
	}

	public AnimalBuilder setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
		return this;
	}
	
	public Animal getAnimal() {
		return new Animal(name, habitat, foodType, sound, lifeSpan);
	}

}
