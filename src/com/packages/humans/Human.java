package com.packages.humans;

public class Human {
	protected int strength;
	protected int intelligience;
	protected int stealth;
	protected int health;
	protected String name;
	
	public Human(String name) {
		this.name = name;
		this.strength = 3;
		this.intelligience = 3;
		this.stealth = 3;
		this.health = 100;
	}
	public void show() {
		System.out.println(this.name + " strength is: " + this.strength + " and health is: " + this.health);
	}
	public Human attack(Human attacked) {
		attacked.health -= this.strength;
		return this;
		
	}
	
	
}
