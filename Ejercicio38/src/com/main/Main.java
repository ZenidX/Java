package com.main;

public class Main {
	public static void main(String[] args) {
		Profesor David = new Profesor("David",4000);
		System.out.println(David.getNombre()+": "+David.getSalario());
		Alumno Xavi = new Alumno("Xavi","FullStack Web");
		System.out.println(Xavi.getNombre()+": "+Xavi.getCurso());
	}
}
