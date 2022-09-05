package com.main;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		Scanner sc = new Scanner(inputStream);
		System.out.println("1. Humano contra humano");
		System.out.println("2. Humano contra CPU (El CPU juega como 0)");
		System.out.println("3. CPU contra CPU");
		System.out.println("Elige: ");
		int modo = sc.nextInt();
		System.out.println(modo);
		System.out.println("Me da igual lo que elijas.");
		Tablero partida=new Tablero();
		boolean f=true;
		int tiradas=0;
		char ficha;
		while(f){
			if(tiradas%2==0){
				ficha='X';
			}else {
				ficha='O';
			}
			partida.plotTablero();
			System.out.printf("Tiran %C.\nElige columna: ",ficha);
			int col=sc.nextInt();
			System.out.printf("Elige fila: ");
			int fil=sc.nextInt();
			partida.tirada(ficha, col,fil);
			tiradas++;
		}
	}
}

class Tablero{
	private char[] game={' ',' ',' ',' ',' ',' ',' ',' ',' '};
	public void tirada(char ficha, int posx, int posy) {
		if(0<posx & posx<4 & 0<posy & posy<4) {		
			this.game[(posx-1)+3*(posy-1)]=ficha;
		}else {
			System.out.println("...eres tonto o que?");
		}
	}
	public void plotTablero(){
		System.out.println();
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(i==0) {
					System.out.printf("%d|",j);
				}else if(j==0){
					System.out.printf("%d|", i);
				}else{
					System.out.printf("%C|", game[(j-1)+3*(i-1)]);
				}
			}
			System.out.println();
		}
	}
}