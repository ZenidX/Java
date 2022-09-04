package com.main;

public class Main {
	public static void main(String[] args) {
		//Animal
		Animal animal=new Animal("Pollito");
		animal.makeSound();
	}
}
class Animal{
	String nombre = "";
	public void makeSound() {
		System.out.println(this.getClass().getName()+" --> Pio Pio...");
	}
	// Contructor sin parametros
	public Animal() {
		System.out.println("Se ha instanciado un objeto desde el constructor sin parametros");;
	}
	//Constructor con parametros
	public Animal(String nombre) {
		System.out.println("Se ha instanciado un objeto desde el constructor con parametros");
		this.nombre=nombre;
	}
}