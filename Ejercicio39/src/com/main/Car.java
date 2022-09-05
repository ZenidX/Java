package com.main;

public class Car {
	private String company;
	private int speed;
	public Car() {
		super();
	}
	public Car(String company, int speed) {
		super();
		this.company=company;
		this.speed=speed;
	}
	public void getSpeed() {
		System.out.printf("%-5s car's speed is %-3d km/h.\n",this.company,this.speed);
	}
}
