package com.main;

public class Main {
	public static void main(String[] args) {
		if(args[0]=="Federico" & args[1]=="GarcíaLorca") {
			Lorca Fede=new Lorca();
			Fede.recitarPoema();
		}else{
			NotAutorized Nope=new NotAutorized();
			Nope.wtfBroh(args);
		}
	}
}

class Lorca{
	public void recitarPoema(){
		System.out.println("Ni idea, yo no soy Federico García Lorca, pidele poemas a tu P*** madre!");
	}
}
class NotAutorized{
	
	public void wtfBroh(String[] args){
		System.out.println(args);
	}
}