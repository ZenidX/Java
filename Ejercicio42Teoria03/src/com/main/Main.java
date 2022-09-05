package com.main;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Dentro del try");
			String nombre = null;
			System.out.println(nombre.length());
			System.out.println("Saliendo del try");
		} catch(ArithmeticException aritmeticException) {
			System.err.println("Se ha producido la siguiente excepción: \n\t"+aritmeticException);
		}catch(Exception exception){
			System.err.println("Se ha producido la siguietne excepción: \n\t"+exception);
		}
	}
}
