
public class Main {
	public static void EjercicioEstructurasCondicionales() {
		int numerotexto = 9;
		switch (numerotexto){
		case 1: System.out.println("Uno");break;
		case 2: System.out.println("Dos");break;
		case 3: System.out.println("Tres");break;
		case 4: System.out.println("Cuatro");break;
		case 5: System.out.println("Cinco");break;
		case 6: System.out.println("Seis");break;
		case 7: System.out.println("Siete");break;
		case 8: System.out.println("Ocho");break;
		case 9: System.out.println("Nueve");break;
		}
		double numberpn =55;
		if(numberpn>0) {
			System.out.println("¡Es positivo!");
		}else if (numberpn<0) {
			System.out.println("Es negativo");
		}else {
			System.out.println("Nulo");
		}
		System.out.println(numberpn>0 ? "Es positivo":(numberpn<0?"Es negativo":"Es 0"));

		System.out.println("\n\n\n");	
	}
	public static void main(String[] args) {
		EjercicioEstructurasCondicionales();
	}

}
