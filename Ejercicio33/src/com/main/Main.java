package com.main;

public class Main {
	public static void main(String[] args) {
		Targeta VISA=new Targeta("NBank","1234567898765432","AL HOLDOR","12/99",true,1000);
		VISA.pagar(3000);
	}
}
class Targeta{
	private String banco;
	private String numero;
	private String nombre;
	private String fecha;
	private boolean operative;
	private double fondo=1000;
	private double credito=-1000;
	public void setBanco(String banco){
		this.banco=banco;
	}
	public void setNumero(String numero){
		this.numero=numero;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setFecha(String fecha){
		this.fecha=fecha;
	}
	public void activar(){
		this.operative=true;
	}
	public void anular(){
		this.operative=false;
	}
	public void pagar(double pago){
		if(operative & this.fondo-pago>credito) {
			this.fondo=this.fondo-pago;
		}else if(operative){
			System.out.println("Ha superado su credito.");
		}else {
			System.out.println("La targeta no esta activada");
		}
	}
	public void ingresar(double cobro) {
		if(operative) {
			this.fondo=this.fondo+cobro;
		}else {
			System.out.println("La targeta no esta activada");
		}
	}
	public String getBanco() {
		return this.banco;
	}
	public String getNumero(){
		return this.numero;
	}
	public String getnombre(){
		return this.nombre;
	}
	public String getFecha(){
		return this.fecha;
	}
	public boolean getOperative(){
		return this.operative;
	}
	public double getFondo(){
		return this.fondo;
	}
	public Targeta(String banco, String numero, String nombre, String fecha, boolean operative,double fondo){
		this.banco=banco;
		this.numero=numero;
		this.nombre=nombre;
		this.fecha=fecha;
		this.operative=operative;
		this.fondo=fondo;
	}
	public Targeta(){
	}
}

