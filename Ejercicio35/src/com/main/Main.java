package com.main;

public class Main {
	public static void main(String[] args) {
		Cliente pepe=new Cliente();
		Empleado carlos=new Empleado();
		pepe.generarCodigo();
		System.out.println(pepe.getCodigo());
		System.out.println(carlos.getSueldo());
	}
}

class Persona{
	private String nombre;
	private String apellidos;
	private String documento;
	private String tipo;
	public Persona(){}
	public Persona(String nombre,String apellidos,String documento,String tipo) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.documento=documento;
		this.tipo=tipo;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public void setDocumento(String docuemtno) {
		this.documento=documento;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDocumento() {
		return documento;
	}
	public String getTipo() {
		return tipo;
	}
}
class Cliente extends Persona{
	private String categoria;
	private String codigo;
	public Cliente(){super();}
	public Cliente(String categoria, String codigo) {
		super();
		this.categoria=categoria;
		this.codigo=codigo;
	}
	public void setCategoria(String categoria) {
		this.categoria=categoria;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	public String getCategoria(){
		return this.categoria;
	}
	public String getCodigo(){
		return this.codigo;
	}
	public void generarCodigo(){
		this.codigo=""+Math.random();
	}
}

class Empleado extends Persona{
	private String tipoContrato;
	private double sueldo;
	public Empleado(){super();}
	public Empleado(String tipoContrato,double sueldo){
		super();
		this.tipoContrato=tipoContrato;
		this.sueldo=sueldo;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato=tipoContrato;
	}
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	public String getTipoContrato() {
		return this.tipoContrato;
	}
	public double getSueldo() {
		return this.sueldo;
	}
}
