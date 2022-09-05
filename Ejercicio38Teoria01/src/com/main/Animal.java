package com.main;

public abstract class Animal {
	public final int OJOS = 0;
	private String nombre = "animal";
	public abstract String sonido(String ruido);
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
}
