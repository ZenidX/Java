package com.main;

public class Alumno{
	//Atributos
	private String nombre;
	private String apellidos;
	private String telefono;
	//Métodos
	public void getInfo(){
		System.out.println(this.nombre+" "+this.apellidos+" "+this.telefono);
	}
	public String getNombre(){
		return this.getNombre();
	}
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
}