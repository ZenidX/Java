package com.main;

public class Developer {
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	private String rolTecnologico;
	public Developer(){
		super();
	}
	public Developer(String nombre,String apellidos,int edad,String dni,String rolTecnologico) {
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.dni=dni;
		this.rolTecnologico=rolTecnologico;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	public void setRolTecnologico(String rolTecnologico) {
		this.rolTecnologico=rolTecnologico;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public int getEdad() {
		return this.edad;
	}
	public String getDni() {
		return this.dni;
	}
	public String getRolTecnologico() {
		return this.rolTecnologico;
	}
}
