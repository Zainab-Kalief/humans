package com.packages.humans;

public class Wizard extends Human {

	public Wizard(String name) {
		super(name);
		this.health = 50;
		this.intelligience = 8;
		// TODO Auto-generated constructor stub
	}
	public Human heal(Human healed) {
		healed.health += this.intelligience;
		return this;
	}
public Human fireball(Human attacked) {
		attacked.health -= 3 * this.health;
		return this;
	}

}
