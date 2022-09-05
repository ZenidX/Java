package com.main;

public class Alumno implements IPersonal{
	private String nombre;
	private String curso;
	public Alumno(){
		super();
	}
	public Alumno(String nombre, String curso) {
		this.nombre=nombre;
		this.curso=curso;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setCurso(String curso) {
		this.curso=curso;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getCurso() {
		return this.curso;
	}
}
