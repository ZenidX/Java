
public class Main {
	public static void AlgebraBooleana() {
		// ALGEBRA BOOLEANA
		boolean interruptor = false;
		System.out.println(!interruptor); // !false = true
		System.out.println(false | false); // = false 
		System.out.println(false | true ); // = true 
		System.out.println(true  | false); // = true
		System.out.println(true  | true ); // = true
		System.out.println(0 | 0); //  = 0
		System.out.println(0 | 1); // = 1
		System.out.println(1 | 0); // = 1
		System.out.println(1 | 1); // = 1
		System.out.println(false || false); // = false 
		System.out.println(false || true ); // = false
		System.out.println(true  || false); // = true
		System.out.println(true  || true ); // = true
		System.out.println(false & false); // = true 
		System.out.println(false & true ); // = false 
		System.out.println(true  & false); // = false
		System.out.println(true  & true ); // = true
		System.out.println(0 & 0); // = 1
		System.out.println(0 & 1); // = 0
		System.out.println(1 & 0); // = 0
		System.out.println(1 & 1); // = 1
		int num1logica = 9;  // 1001 = 9
		int num2logica = 12; // 1100 = 12   1101=13
		System.out.println(num1logica | num2logica); //1001
		String binaryString="1101";
		int decimal=Integer.parseInt(binaryString,2);
		System.out.println(decimal);
		System.out.println(false ^ false); // = false
		System.out.println(false ^ true ); // = true
		System.out.println(true  ^ false); // = true
		System.out.println(true  ^ true ); // = false
		System.out.println(0 ^ 0); // = 0
		System.out.println(0 ^ 1); // = 1
		System.out.println(1 ^ 0); // = 1
		System.out.println(1 ^ 1); // = 0
		int resultlogica = num1logica ^ num2logica; // 1001 ^ 1100 = 0101
		System.out.println(resultlogica);
		System.out.println("\n\n\n");
	}
	public static void EjercicioOperadoresLogicos(){
		// EJERCICIO DE OPERADORES LOGICOS
		boolean bool1exercice = true;
		boolean bool2exercice = false;
		boolean bool3exercice = false;
		System.out.println(bool1exercice==!bool2exercice);
		System.out.println(bool2exercice==!bool3exercice);	
		System.out.println("\n\n\n");
	}
	public static void main(String[] args) {
		AlgebraBooleana();
		EjercicioOperadoresLogicos();
	}
}