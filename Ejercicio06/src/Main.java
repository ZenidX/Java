
public class Main {
	public static void CodigoChar_y_Rangos(){
		//CARACTERES
		// Declaración de caracteres utilizando el formato del sistema UNICODE forma 1
		char caracterUnicode = '\u0023';
		System.out.println(caracterUnicode);
		// Declaración de caracteres utilizando el fromato del sistema UNICODE forma 2
		char caracterOctal = 0x0023;
		System.out.println(caracterOctal);
		// Declaración directa por caracter
		char caracterCaracter = '#';
		System.out.println(caracterCaracter);
		// Declaración utilizando el  número entero
		char caracterDecimal = 35;
		System.out.println(caracterDecimal);
		// Declaración utilizando un número binario
		char caracterBinario = 0b0000000000100011;
		System.out.println(caracterBinario);
		//BYTE, SHORT, INT, LONG
		byte byterangomin =-128;
		byte byterangomax = 127;
		short shortrangomin =-32768;
		short shortrangomax = 32767;
		int intrangomin =-2147483648;
		int intrangomax = 2147483647;
		long longrangomin =-9223372036854775807L;
		long longrangomax =9223372036854775807L;
		System.out.println("El rango de los byte  es de "+byterangomin+"                 a "+byterangomax);
		System.out.println("El rango de los short es de "+shortrangomin+"               a "+shortrangomax);
		System.out.println("El rango de los int   es de "+intrangomin+"          a "+intrangomax);
		System.out.println("El rango de los long  es de "+longrangomin+" a "+longrangomax);
		System.out.println("El rango de los long  es de "+Long.MIN_VALUE+" a "+Long.MAX_VALUE);
		float floatrangomin = (float) 1.4E-45;
		float floatrangomax = 3.4028235E38f;
		double doublerangomin = 4.9E-324;
		double doublerangomax = 1.7976931348623157E308;
		System.out.println("El rango de los float  es de "+floatrangomin+"  a "+floatrangomax);
		System.out.println("El rango de los float  es de "+Float.MIN_VALUE+"  a "+Float.MAX_VALUE);
		System.out.println("El rango de los double es de "+doublerangomin+" a "+doublerangomax);
		System.out.println("El rango de los double es de "+Double.MIN_VALUE+" a "+Double.MAX_VALUE);
		System.out.printf("%.2f\n",Float.MAX_VALUE);
		System.out.printf("%.2f\n",Double.MAX_VALUE);
		
		System.out.println("");	
		System.out.println("");	
		System.out.println("");
	}
	public static void EjercicioDesbordamientoEnteros(){
		// EJERCICIO DE DESBORDAMIENTO DE ENTEROS
		byte desborde_byte   = (byte) 132;
		short desborde_short = (short) 32792;
		int desborde_int     = (int)  2147493647l;
		long desborde_long   = Long.MAX_VALUE+20000;
		System.out.println("Desborde en  5    posiciones de un  byte: "+desborde_byte);
		System.out.println("Desborde en 25    posiciones de un short: "+desborde_short);
		System.out.println("Desborde en 10000 posiciones de un   int: "+desborde_int);
		System.out.println("Desborde en 20000 posiciones de un  long: "+desborde_long);
		System.out.println("\n\n\n");
	}
	public static void main(String[] args) {
		CodigoChar_y_Rangos();
		EjercicioDesbordamientoEnteros();
	}
}
