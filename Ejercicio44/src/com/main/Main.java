package com.main;

public class Main {
	public static void main(String[] args) {
		Developer[] XLRP = {
				new Developer("Xavi","Lara",    24,"53874119T",Profesionales.BackEndDeveloper.toString()),
				new Developer("Luis","Martinez",24,"12345678A",Profesionales.FrontEndDeveloper.toString()),
				new Developer("Pol","Policia",  22,"12345678A",Profesionales.FullStackDeveloper.toString()),
				new Developer("Ruben","Marin",  24,"12345678A",Profesionales.BackEndDeveloper.toString())
		};
		for(Developer Crack:XLRP){
			if(Crack.getRolTecnologico()==Profesionales.BackEndDeveloper.toString()|Crack.getRolTecnologico()==Profesionales.FullStackDeveloper.toString()){
				System.out.println("Viva el Back");
			}
			if(Crack.getRolTecnologico()==Profesionales.BackEndDeveloper.toString()){
				System.out.println("JS es una caca, es mejor utilizar TypeScript");
			}
		}
	}
}
