package com.main;

public class Main {
	public static void main(String[] args){
		System.out.println("Instrucci�n 1");
		try {
			String txt="Generando una excepci�n NullPointer";
			throw new NullPointerException(txt);
		}catch(Exception e){
			System.err.println(e);
		}
		System.out.println("Intrucci�n 3");
	}
}
