package com.main;

public class Main {
	public static int getLength(String txt) throws NullPointerException{
		return txt.length();
	}
	public static void main(String[] args){
		System.out.println("Instrucci�n 1");
		try {
			System.out.println(getLength(null));
		}catch(Exception e){
			System.err.println(e);
		}
		System.out.println("Intrucci�n 3");
	}
}
