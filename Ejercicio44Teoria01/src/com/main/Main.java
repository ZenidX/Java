package com.main;

public class Main {
	public static void main(String[] args) {
		System.out.println("Posiciones: ");
		for(Posicion item: Posicion.values()){
			System.out.println(" - "+item);
		}
		String miPosicion= "PORTERO";
		if(miPosicion.equals(Posicion.PORTERO.toString())) {
			System.out.println("A la portería");
		}
	}
}
