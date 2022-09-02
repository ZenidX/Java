
public class Main {
	public static void EjercicioConstantes() {
		// EJERCICIO DE CONSNTANTES
		// Lógico
		@SuppressWarnings("unused")
		final boolean constant_boolean = true;   // 1 bit
		// Caracter
		@SuppressWarnings("unused")
		final char   constant_char ='a';         //16 bits
		@SuppressWarnings("unused")
		final String constant_String= "Strings"; // 8 bits
		// Numéricos enteros
		@SuppressWarnings("unused")
		final byte  constant_byte=1;             // 8 bits
		@SuppressWarnings("unused")
		final short constant_short=1;            //16 bits
		@SuppressWarnings("unused")
		final int   constant_int=3;              //34 bits
		@SuppressWarnings("unused")
		final long  consntant_long=4;            //64 bits
		// Numéricos reales
		@SuppressWarnings("unused")
		final float  constant_float=3.10f;       //32 bits
		@SuppressWarnings("unused")
		final double constant_double=3.14159;    //64 bits
		System.out.println("\n\n\n");	
	}
	public static void main(String[] args) {
		EjercicioConstantes();
	}

}
