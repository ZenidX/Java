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
	}
}
