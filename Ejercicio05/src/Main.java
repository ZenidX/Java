
public class Main {
	public static void EjercicioClasificarVariablesPrimitivas(){
		// EJERCICIO DE CLASIFICAR LAS VARIABLES PRIMITIVAS
		// Lógico
		boolean clasify_boolean = true;
		System.out.println("Aquí un booleano: "+clasify_boolean);
		// Caracter
		char   clasify_char ='a';
		String clasify_String= "Strings";
		System.out.println("Aquí un caracter: "+clasify_char);
		System.out.println("Aquí un String: "+clasify_String);
		// Numéricos enteros
		byte  clasify_byte=1;
		short clasify_short=1;
		int   clasify_int=3;
		long  clasify_long=4;
		System.out.println("Aquí un byte: "+clasify_byte);
		System.out.println("Aquí un short: "+clasify_short);
		System.out.println("Aquí un int: "+clasify_int);
		System.out.println("Aquí un long: "+clasify_long);
		// Numéricos reales
		float  clasify_float=3.10f;
		double clasify_double=3.14159;
		System.out.println("Aquí un float: "+clasify_float);
		System.out.println("Aquí un double: "+clasify_double);
		// Constantes
		final String clasify_constant ="constante";
		System.out.println("Aquí un String fijado: "+clasify_constant);
		System.out.println("\n\n\n");
	}
	public static void main(String[] args) {
		EjercicioClasificarVariablesPrimitivas();
	}
}
