package com.main;

public class Main {
	public static int getLength(String txt) throws NullPointerException{
		return txt.length();
	}
	public static void main(String[] args){
		System.out.println("Intrucción 1");
		System.out.println(getLength(null));
		System.out.println("Intrucción 3");
	}
}
