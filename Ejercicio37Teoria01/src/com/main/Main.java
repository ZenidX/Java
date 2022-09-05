package com.main;

public class Main extends Animal{
	public static void main(String[] args) {
		Main m= new Main();
		System.out.println(m.OJOS);
		m.setNombre("Lobo");
		System.out.println(m.getNombre());
	}
	public String sonido(String ruido) {
		return null;
	}
}
