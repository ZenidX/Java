package com.main;

public class Main {
	public static void main(String[] args) {
		//Instanciando a la clase Alumno
		Alumno alumno = new Alumno();
		//A�adiendo valores a las propiedades
		alumno.nombre="David";
		alumno.apellidos="Bernal Gonz�lez";
		alumno.telefono="656393148";
		//Llamando a los m�todos
		alumno.getInfo();
	}
}