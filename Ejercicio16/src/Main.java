
public class Main {
	public static void EjercicioEstructurasCondicionales() {
		// EJERCICIO DE ESTRUCTURAS CONDICIONALES
		boolean colorete = true;
		if(colorete==true){
			System.err.println("PAPAYA");
		}else if(colorete== false){
			System.out.println("PAPAYA");
		}else{}
		if(colorete==true){
			System.err.println("PAPAYA");
		}else{
			System.out.println("PAPAYA");
		}
		double temperatura =37;
		if(temperatura<10){
			System.out.print("Clima frio: ");
			if(temperatura<5){
				System.out.println("Polar.");
			}else{
				System.out.println("Alta montaña");
			}
		}else if(10<=temperatura & temperatura<=20){
			System.out.print("Clima templado: ");
			if(temperatura<13.5){
				System.out.println("Oceánico");
			}else if(13.5<=temperatura & temperatura<16.5){
				System.out.println("Mediterráneo");
			}else{
				System.out.println("Continental");
			}
		}else{
			System.out.print("Clima cálido: ");
			if(temperatura<23.5){
				System.out.println("Ecuatorial");
			}else if(23.5<=temperatura & temperatura<26.5){
				System.out.println("Tropical");
			}else {
				System.out.println("Desértico");
			}
		}
	}
	public static void main(String[] args) {
		EjercicioEstructurasCondicionales();
	}
}
