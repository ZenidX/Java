package com.main;

public class Main {
	public static void main(String[] args) {
		AnimalHerbivoro caballo=new AnimalHerbivoro();
		AnimalCarnivoro tigrete=new AnimalCarnivoro();
		Planta cactus=new Planta();
		cactus.alimentarse();
		caballo.alimentarse();
		tigrete.alimentarse();
	}
}
