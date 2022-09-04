package com.main;

public class Main {
	public static void main(String[] args) {
		//Instanciando a la clase Alumno
		Alumno alumno = new Alumno();
		//Añadiendo valores a las propiedades
		alumno.nombre="David";
		alumno.apellidos="Bernal González";
		alumno.telefono="656393148";
		//Llamando a los métodos
		alumno.getInfo();
	}
}
class Alumno{
	//Atributos
	String nombre;
	String apellidos;
	String telefono;
	//Métodos
	public void getInfo() {
		System.out.println(this.nombre+" "+this.apellidos+" "+this.telefono);
	}
}