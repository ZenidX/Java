package com.main;

public class Profesor implements IPersonal{
	private String nombre;
	private double salario;
	public Profesor() {
		super();
	}
	public Profesor(String nombre, double salario) {
		super();
		this.nombre=nombre;
		this.salario=salario;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setSalario(double salario) {
		this.salario=salario;
	}
	public String getNombre(){
		return this.nombre;
	}
	public double getSalario() {
		return this.salario;
	}
}
