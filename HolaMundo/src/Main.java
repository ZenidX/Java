
public class Main {
	public static void HollaMundo() {
		System.out.println("Hello World");
		System.out.println("MONDO MONDO");
		System.out.println("\n\n\n");	
	}	
	public static void EjercicioSaltoLinea(){
		// EJERCICIO DE SALTO DE LINEA
		System.err.println("Este tipo de mensajes aparecen en la "
				+ "consola en rojo \n y nos sirven para mostrar errores");
		String nombre = "Ruben";
		String bebeme = "ALCOHOL";
		System.out.println("Hola "+ nombre+" bebe "+bebeme);
		System.out.println("\n\n\n");
	}
	public static void EjercicioComentar(){
		// Ejercicio de comentar
		int num1 = 10; //Hacemos un entero que valga 10.
		int num2 = 20; //Hacemos un entero que valga 20.
		int suma = num1 + num2; //Hacemos un entero que se la suma de los dos anteriores
		System.out.println(suma); //Los printemaos por consola		
		System.out.println("\n\n\n");
	}
	public static void EjercicioClasificarVariablesPrimitivas(){
		// EJERCICIO DE CLASIFICAR LAS VARIABLES PRIMITIVAS
		// L�gico
		boolean clasify_boolean = true;
		System.out.println("Aqu� un booleano: "+clasify_boolean);
		// Caracter
		char   clasify_char ='a';
		String clasify_String= "Strings";
		System.out.println("Aqu� un caracter: "+clasify_char);
		System.out.println("Aqu� un String: "+clasify_String);
		// Num�ricos enteros
		byte  clasify_byte=1;
		short clasify_short=1;
		int   clasify_int=3;
		long  clasify_long=4;
		System.out.println("Aqu� un byte: "+clasify_byte);
		System.out.println("Aqu� un short: "+clasify_short);
		System.out.println("Aqu� un int: "+clasify_int);
		System.out.println("Aqu� un long: "+clasify_long);
		// Num�ricos reales
		float  clasify_float=3.10f;
		double clasify_double=3.14159;
		System.out.println("Aqu� un float: "+clasify_float);
		System.out.println("Aqu� un double: "+clasify_double);
		// Constantes
		final String clasify_constant ="constante";
		System.out.println("Aqu� un String fijado: "+clasify_constant);
		System.out.println("\n\n\n");
	}
	public static void CodigoChar_y_Rangos(){
		//CARACTERES
		// Declaraci�n de caracteres utilizando el formato del sistema UNICODE forma 1
		char caracterUnicode = '\u0023';
		System.out.println(caracterUnicode);
		// Declaraci�n de caracteres utilizando el fromato del sistema UNICODE forma 2
		char caracterOctal = 0x0023;
		System.out.println(caracterOctal);
		// Declaraci�n directa por caracter
		char caracterCaracter = '#';
		System.out.println(caracterCaracter);
		// Declaraci�n utilizando el  n�mero entero
		char caracterDecimal = 35;
		System.out.println(caracterDecimal);
		// Declaraci�n utilizando un n�mero binario
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
	public static void EjercicioConstantes() {
		// EJERCICIO DE CONSNTANTES
		// L�gico
		@SuppressWarnings("unused")
		final boolean constant_boolean = true;   // 1 bit
		// Caracter
		@SuppressWarnings("unused")
		final char   constant_char ='a';         //16 bits
		@SuppressWarnings("unused")
		final String constant_String= "Strings"; // 8 bits
		// Num�ricos enteros
		@SuppressWarnings("unused")
		final byte  constant_byte=1;             // 8 bits
		@SuppressWarnings("unused")
		final short constant_short=1;            //16 bits
		@SuppressWarnings("unused")
		final int   constant_int=3;              //34 bits
		@SuppressWarnings("unused")
		final long  consntant_long=4;            //64 bits
		// Num�ricos reales
		@SuppressWarnings("unused")
		final float  constant_float=3.10f;       //32 bits
		@SuppressWarnings("unused")
		final double constant_double=3.14159;    //64 bits
		System.out.println("\n\n\n");	
	}
	public static void EjercicioConcatenacionCadenas() {
		// EJERCICIO DE CONCATENACI�N DE CADENAS
		String nombreconcat = "Xavi";
		String apelliconcat = "Lara Moreno";
		String calle_concat = "C/Pirineus 17";
		String municiconcat = "Sant Cugat del Vall�s";
		String postZPconcat = "08195";
		char   sexo__concat = 'M';
		String email_concat = "zenid77@gmail.com";
		String datos = nombreconcat+" "+apelliconcat+", "+calle_concat+", "+municiconcat+" "+postZPconcat+", "+sexo__concat+", "+email_concat;
		System.out.println(datos);
		System.out.println("\n\n\n");	
	}
	public static void EjercicioOperadoresRelacion(){
		// EJERCICIO DE OPERADORES DE RELACI�N
		int num1operadores = 1;
		int num2operadores = 2;
		int num3operadores = 3;
		int num4operadores = 2;
		System.out.println(num4operadores==num2operadores);
		System.out.println(num2operadores==num3operadores);
		System.out.println(num1operadores!=num3operadores);
		System.out.println(num2operadores!=num2operadores);
		System.out.println(num4operadores <num3operadores);
		System.out.println(num3operadores <num1operadores);
		System.out.println(num1operadores >num3operadores);
		System.out.println(num2operadores >num4operadores);
		System.out.println(num2operadores >num3operadores);
		System.out.println(num2operadores<=num3operadores);
		System.out.println(num2operadores<=num4operadores);
		System.out.println(num2operadores<=num1operadores);
		System.out.println(num1operadores>=num2operadores);
		System.out.println(num2operadores>=num1operadores);
		System.out.println(num2operadores>=num2operadores);
		System.out.println("\n\n\n");
	}
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
				System.out.println("Alta monta�a");
			}
		}else if(10<=temperatura & temperatura<=20){
			System.out.print("Clima templado: ");
			if(temperatura<13.5){
				System.out.println("Oce�nico");
			}else if(13.5<=temperatura & temperatura<16.5){
				System.out.println("Mediterr�neo");
			}else{
				System.out.println("Continental");
			}
		}else{
			System.out.print("Clima c�lido: ");
			if(temperatura<23.5){
				System.out.println("Ecuatorial");
			}else if(23.5<=temperatura & temperatura<26.5){
				System.out.println("Tropical");
			}else {
				System.out.println("Des�rtico");
			}
		}
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
			System.out.println("�Es positivo!");
		}else if (numberpn<0) {
			System.out.println("Es negativo");
		}else {
			System.out.println("Nulo");
		}
		System.out.println(numberpn>0 ? "Es positivo":(numberpn<0?"Es negativo":"Es 0"));

		System.out.println("\n\n\n");	
	}
	public static void EjercicioDibujarArbolBucles(){
		// EJERCICIO DE DIBUJAR ARBOL CON BUCLES
		int arbol = 0;
		int hojas = 0; 
		int aires = 0;
		int woods = 0;
		for(arbol=0;arbol<10;arbol++){
			System.out.println("");
			for(aires=10;aires>arbol;aires--){
				System.out.print(" ");
			}
			for(hojas=0;hojas<arbol;hojas++){
				System.out.print("**");
			}
			for(aires=10;aires>arbol;aires--){
				System.out.print(" ");
			}
		}
		for(woods=0;woods<2;woods++){
			System.out.println("");
			for(aires=10;aires>2;aires--){
				System.out.print(" ");
			}
			for(hojas=0;hojas<2;hojas++){
				System.out.print("**");
			}
			for(aires=10;aires>2;aires--){
				System.out.print(" ");
			}
		}
		System.out.println("\n\n\n");
	}
	public static void EjercicioEstructurasRepetitivas(){
		// EJERCICIO DE ESTRUCTURAS REPETITIVAS
		int divisibles2 =0;
		for(divisibles2=0;divisibles2<100;divisibles2++){
			if(divisibles2%2==0){
				System.out.print(divisibles2+", ");
			}
		}
		double[] divisible3array = {1,5,27};
		for(double divisible3: divisible3array) {
			if(divisible3%3==0) {
				System.out.println(divisible3);
			}
		}
		double[] divisible3darray = {1,5,27};
		int divisible3 = 0;
		while(divisible3<3){
			if(divisible3darray[divisible3]%3==0) {
				System.out.println(divisible3);
			}
			divisible3++;
		}
		do{System.out.println("Saludos");}while(divisible3==5);
		char[] abcdario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int filasletras=0;
		int indiceletras=abcdario.length-1;
		while(filasletras<abcdario.length){
			indiceletras=abcdario.length-1;
			while(indiceletras>filasletras){
				System.out.print(abcdario[indiceletras]);
				indiceletras--;
			}
			System.out.println("");
			filasletras++;
		}
		for(filasletras=0;filasletras<abcdario.length;filasletras++){
			for(indiceletras=abcdario.length-1;indiceletras>=filasletras;indiceletras--){
				System.out.print(abcdario[indiceletras]);
			}
			System.out.println("");
		}
		filasletras =0;
		do{
			indiceletras=abcdario.length-1;
			do {
				System.out.print(abcdario[indiceletras]);
				indiceletras--;
			}while(indiceletras>=filasletras);
			System.out.println("");
			filasletras++;
		}while(filasletras<abcdario.length);
		System.out.println("\n\n\n");
	}
	public static void EjercicioIntruccionesSalto(){
		// EJERCICIO DE INSTRUCCIONES DE SALTO
		for(int iteracion3=0;true;iteracion3++){
			System.out.println("ITERACION: "+iteracion3);
			if(iteracion3>=2) {
				break;
			}
		}
		int iteracion3=0;
		while(iteracion3<10){
			if(iteracion3>=3){
			}else{
			System.out.println("ITERACION: "+iteracion3);
			}
			iteracion3++;
		}
		System.out.println("\n\n\n");	
	}
	public static void EjercicioFunciones(){
		// EJERCICIO DE FUNCIONES
		System.out.println(javaOrNull("java"));
		System.out.println(loginLogin("admin","1234"));
	}
	public static String javaOrNull(String javaxx){
			if(javaxx=="java"){
				return javaxx;
			}else{
				return null;
			}
		}
	public static String loginLogin(String account, String password){
		if(account=="admin" & password=="1234") {
			return "Login true";
		}else{
			return "Login false";
		}
	}
	public static void colores8(){
		// BACKGROUN Y COLOR TEXTO CON 8 COLORES
		// Ejemplo con formato Unicode: \u001b
		System.out.println("\u001b[0;31mTexto de color rojo\u001b[0m");
		System.out.println("Texto sin formato");
		System.out.println("\u001b[0;41mTexto subrayado\u001b[0m");
		// Ejemplo con formato Octal: \033
		System.out.println("\033[0;32mTexto ed color rojo\033[0m");
		System.out.println("Texto sin formato");
		System.out.println("\033[0;42mTexto subrayado\033[0m");
	}
	public static void colores16(){
		// Set foreground color.
		System.out.println("\033[94mTrabajando con 16 colores\033[0m");
		// Set background color.
		System.out.println("\033[103mTrabajando con 16 colores\033[0m");
		// Set foreground color + set bacground color.
		System.out.println("\033[95;106mTrabajando con 16 colores\033[0m");
	}
	public static void colores256(){
		// 256 colores: PALETE COLOR FORMAT
		System.out.println("\033[38;5;43mTexto con palette color y 256 colores\033[0m");
		System.out.println("\033[48;5;74mTexto con palette color y 256 colores\033[0m");
		// 256 colores: RBG COLOR FORMAT
		System.out.println("\033[38;5;153;204;255mTexto con palette color y 256 colores\033[0m");
		System.out.println("\033[48;5;153;204;255mTexto con palette color y 256 colores\033[0m");
	}
	public static void EjercicioColoresBanderasANSI(){
		final int RED    = 196;
		final int YELLOW = 226;
		final int BLUE   =  21;
		final int WHITE  = 255;
		final int BLACK  =   0;
		System.out.println("\033[1mUCRANIA\033[0m");
		for(int j=0;j<10;j++){
			for(int i=0;i<20;i++){
				if(j<5){
					System.out.format("\033[48;5;%dm  \033[0m",BLUE);
				}else{
					System.out.format("\033[48;5;%dm  \033[0m",YELLOW);
				}
			}
			System.out.println("");
		}
		System.out.println("\033[2mGRECIA\033[0m");
		for(int i=0;i<10;i++){
			for(int j=0;j<20;j++){
				if(j<5 & i<5){
					if(i==2){
						System.out.format("\033[48;5;%dm  \033[0m",WHITE);
					}else if(j==2){
						System.out.format("\033[48;5;%dm  \033[0m",WHITE);
					}else{
						System.out.format("\033[48;5;%dm  \033[0m",BLUE);
					}
				}else if(i%2==0){
					System.out.format("\033[48;5;%dm  \033[0m",WHITE);
				}else{
					System.out.format("\033[48;5;%dm  \033[0m",BLUE);
				}
			}
			System.out.println("");
		}
		System.out.println("\033[3mFRANCIA\033[0m");
		for(int i=0;i<10;i++){
			for(int j=0;j<20;j++){
				if(j<6){
					System.out.format("\033[48;5;%dm  \033[0m",BLUE);
				}else if(j<14){
					System.out.format("\033[48;5;%dm  \033[0m",WHITE);
				}else{
					System.out.format("\033[48;5;%dm  \033[0m",RED);
				}
			}
			System.out.println("");
		}
		System.out.println("\033[4mESPA�A\033[0m");
		for(int i=0;i<10;i++){
			for(int j=0;j<20;j++){
				if(i<3|i>6){
					System.out.format("\033[48;5;%dm  \033[0m",160);
				}else{
					System.out.format("\033[48;5;%dm  \033[0m",YELLOW);
				}
			}
			System.out.println("");
		}
		System.out.println("\033[9mCATALU�A\033[0m");
		for(int i=0;i<11;i++){
			for(int j=0;j<20;j++){
				if(i%2==0){
					System.out.format("\033[48;5;%dm  \033[0m",YELLOW);
				}else{
					System.out.format("\033[48;5;%dm  \033[0m",RED);
				}
			}
			System.out.println("");
		}
		System.out.println("\033[7mNAZILANDIA\033[0m");
		for(int i=0;i<12;i++){
			for(int j=0;j<20;j++){
				if(i<4){
					System.out.format("\033[48;5;%dm  \033[0m",BLACK);
				}else if(i<8){
					System.out.format("\033[48;5;%dm  \033[0m",RED);
				}else{
					System.out.format("\033[48;5;%dm  \033[0m",YELLOW);
				}
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i=0;i<256;i++){
			if((i+2)%6==0 & i>14){
				System.out.println("");
			}else{}
			System.out.format("\033[48;5;%dm  \033[0m",i);
		}
		// EJERCICIO DE DIBUJAR ARBOL CON BUCLES
		final int GREEN = 34;
		final int BLACKSS =  0;
		int arbol = 0;
		int hojas = 0; 
		int aires = 0;
		int woods = 0;
		for(arbol=0;arbol<10;arbol++){
			System.out.println("");
			for(aires=10;aires>arbol;aires--){
				System.out.format("\033[48;5;%dm \033[0m",WHITE);
			}
			for(hojas=0;hojas<arbol;hojas++){
				System.out.format("\033[48;5;%dm**\033[0m",GREEN);
			}
			for(aires=10;aires>arbol;aires--){
				System.out.format("\033[48;5;%dm \033[0m",WHITE);
			}
		}
		for(woods=0;woods<2;woods++){
			System.out.println("");
			for(aires=10;aires>2;aires--){
				System.out.format("\033[48;5;%dm \033[0m",WHITE);
			}
			for(hojas=0;hojas<2;hojas++){
				System.out.format("\033[48;5;%dm**\033[0m",BLACKSS);
			}
			for(aires=10;aires>2;aires--){
				System.out.format("\033[48;5;%dm \033[0m",WHITE);
			}
		}
		System.out.println("");
	}
	public static void main (String[] args){
		HollaMundo();
		EjercicioSaltoLinea();
		EjercicioClasificarVariablesPrimitivas();
		CodigoChar_y_Rangos();
		EjercicioDesbordamientoEnteros();
		EjercicioConstantes();
		EjercicioConcatenacionCadenas();
		EjercicioOperadoresRelacion();
		AlgebraBooleana();
		EjercicioOperadoresLogicos();
		EjercicioEstructurasCondicionales();
		EjercicioDibujarArbolBucles();
		EjercicioEstructurasRepetitivas();
		EjercicioIntruccionesSalto();
		EjercicioFunciones();
		colores8();
		colores16();
		colores256();
		EjercicioColoresBanderasANSI();
	}
}
