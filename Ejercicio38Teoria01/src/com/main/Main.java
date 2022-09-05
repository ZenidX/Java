package com.main;

public class Main implements IAnimal {
	
	public static void main(String[] args) {
		Main m=new Main();
		System.out.println(CONSTANTE_1);
		System.out.println(CONSTANTE_2);
		System.out.println(m.ruido("Grr"));
		System.out.println(m.tipoAnimal("Mamifero"));
	}
	
	public String ruido(String ruido) {
		return ruido;
	}
	public String tipoAnimal(String tipo) {
		return tipo;
	}
}
