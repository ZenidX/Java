package com.main;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		Scanner sc = new Scanner(inputStream);
		System.out.print("Intoduce tu edad: ");
		int edad = sc.nextInt();
		System.out.println(edad);
		System.out.print("Es cierto?: ");
		boolean verif=sc.nextBoolean();
		if(verif==true) {
			System.out.println(verif);
		}else {
			System.out.println("Tu puta madre!");
		}
		
	}
}
