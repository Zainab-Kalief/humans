package com.packages.humans;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human sam = new Human("Sam");
		Human dave = new Human("Dave");
		Wizard tope = new Wizard("Tope");
		Samuria wurry = new Samuria("Wurry");
		Samuria nessa = new Samuria("Vanessa");
		Ninja kunmi = new Ninja("Kunmi");
		sam.show();
		dave.attack(sam);
		sam.show();
		tope.heal(sam);
		sam.show();
		dave.show();
		tope.fireball(dave);
		dave.show();
		kunmi.steal(wurry).run();
		kunmi.show();
		wurry.deathBlow(tope);
		tope.show();
		wurry.show();
		nessa.show();
		System.out.println(Samuria.howMany());
	}

}
