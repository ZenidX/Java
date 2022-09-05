package com.main;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Instrucción 1");
			System.out.println(5/0);
			System.out.println("Instrucción 2");
		} catch(Exception e) {
			System.err.println("Se ha producido la siguiente excepción: \n\t"+e);
		}
	}
}
