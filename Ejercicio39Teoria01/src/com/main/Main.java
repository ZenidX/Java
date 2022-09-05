package com.main;

public class Main {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Lobo();
		Lobo lobo = new Lobo();
		animal1.makeSound();
		lobo.getNombreAnimal();
		animal2.makeSound();
	}
}

class Animal{
	public void makeSound() {
		System.out.println(this.getClass().getName()+" --> Pio Pio ... pollito");
	}
}

class Lobo extends Animal{
	private String nombreAnimal="Lobo";
	public void makeSound() {
		System.out.println(this.getClass().getName()+" --> Auuuuuu... lobito");
	}
	public void getNombreAnimal() {
		System.out.println(this.getClass().getName()+" --> "+nombreAnimal);
	}
}