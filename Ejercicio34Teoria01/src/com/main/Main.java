package com.main;

public class Main {
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.makeSoundAnimal();
		Lobo lobo=new Lobo();
		lobo.getNombreAnimal();
		lobo.makeSoundLobo();
		lobo.makeSoundAnimal();
	}
}
class Animal{
	public void makeSoundAnimal() {
		System.out.println(this.getClass().getName()+"--> Pio Pio ...");
	}
}
class Lobo extends Animal{
	private String nombreAnimal="Lobo";
	public void getNombreAnimal() {
		System.out.println(this.getClass().getName()+" --> "+nombreAnimal);
	}
	public void makeSoundLobo(){
		System.out.println(this.getClass().getName()+" -- Auuuuuuu...");
	}
}