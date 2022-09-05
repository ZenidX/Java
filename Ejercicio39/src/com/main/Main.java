package com.main;

public class Main {
	public static void main(String[] args) {
		Car H = new Car("Honda",100);
		Car J = new Car("Jeep",500);
		Car B = new Car("BMW",800);
		H.getSpeed();
		J.getSpeed();
		B.getSpeed();
	}
}
