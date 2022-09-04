package com.main;

public class Main{
	public static void main(String[] args){
		Programmer tocateclas=new Programmer(500,1000);
		System.out.println(tocateclas.getSalary());
		System.out.println(tocateclas.getBonus());
	}
}
class Employee{
	private float salary=1000;
	public Employee(float salary){
		this.salary=salary;
	}
	public void setSalary(float salary){
		this.salary=salary;
	}
	public float getSalary(){
		return salary;
	}
}
class Programmer extends Employee{
	private int bonus;
	public Programmer(int bonus,float salary){
		super(salary);
		this.bonus=bonus;
	}
	public void setBonus(int bonus){
		this.bonus=bonus;
	}
	public int getBonus(){
		return bonus;
	}
}
