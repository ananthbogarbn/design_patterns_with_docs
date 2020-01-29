package com.pattern.creational.builderdesign;

public class Animal {

	//required parameters 
	private String name;
	private String habitat;
	private int lifeSpan;
	
	//optional parameters
	private String foodType;
	private String sound;
	

	public Animal(String name, String habitat, String foodType, String sound, int lifeSpan) {
		super();
		this.name = name;
		this.habitat = habitat;
		this.foodType = foodType;
		this.sound = sound;
		this.lifeSpan = lifeSpan;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", habitat=" + habitat + ", foodType=" + foodType + ", sound=" + sound
				+ ", lifeSpan=" + lifeSpan + "]";
	}

}
