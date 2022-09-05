package com.main;

public class Main {
	public static void main(String[] args){
		System.out.println("Instrucción 1");
		try {
			String txt="Generando una excepción NullPointer";
			throw new NullPointerException(txt);
		}catch(Exception e){
			System.err.println(e);
		}
		System.out.println("Intrucción 3");
	}
}
