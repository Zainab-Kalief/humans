package com.packages.humans;

public class Ninja extends Human {
	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	
	public Ninja steal(Human human) {
		this.health += human.stealth;
		return this;
	}
	public Ninja run() {
		this.health -= 10;
		return this;
	}
}
