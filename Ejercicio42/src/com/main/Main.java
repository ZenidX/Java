package com.main;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public void papaya() throw 
	public static void main(String[] args){
		InputStream inputStream = System.in;
		Scanner sc = new Scanner(inputStream);
		try {
			System.out.println("Mete un número");
			int num = sc.nextInt();
			System.out.println("Dividelo:");
			int div = sc.nextInt();
			System.out.println(num/div);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Surprise motherfucker!");
		System.out.println("Seguimos...");
		try{
			System.out.println();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
