package com.packages.humans;

public class Samuria extends Human {
	private static int size;
	public Samuria(String name) {
		super(name);
		this.health = 200;
		size ++;
	}
	
	public Samuria deathBlow(Human human) {
		human.health = 0;
		this.health = (int) this.health / 2 ;
		return this;
	}
	public Samuria meditate() {
		this.health = 200;
		return this;
	}
	
	public static int howMany() {
		return size;
	}
}
