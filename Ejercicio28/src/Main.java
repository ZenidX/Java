
public class Main {
	public static void FuncionPrintf(){
		LineaGuionesConsola();
		System.out.printf("%s%n","Hola\n");
		LineaGuionesConsola();
		System.out.printf("Salto de linea \n Salto de linea\n");
		LineaGuionesConsola();
		System.out.printf("Tabulador \t Tabuladorete \n Tabuladorete \t Tabulador\n");
		LineaGuionesConsola();
		System.out.printf("RetornoCa \b RetornoCarro \n RetornoCarro \b RetornoCa\n");
		LineaGuionesConsola();
		System.out.printf("\\ Barra diagonal \\\n");
		LineaGuionesConsola();
		System.out.printf("\" Dobles comillas\"\n");
		LineaGuionesConsola();
		String txt="String";
		System.out.printf("%s <- Esto es un String\n",txt);
		LineaGuionesConsola();
		System.out.printf("%S <- Esto es un String obligando mayusculas\n",txt);
		LineaGuionesConsola();
		char cha='c';
		System.out.printf("%c <- Esto es un caracter\n",cha);
		LineaGuionesConsola();
		System.out.printf("%C <- Esto es un caracter obligando mayusculas\n",cha);
		LineaGuionesConsola();
		int inttt=13;
		System.out.printf("%d <- Esto es un entero\n",inttt);
		LineaGuionesConsola();
		float floaaa=13.1f;
		System.out.printf("%f <- Esto es un float\n",floaaa);
		LineaGuionesConsola();
		double doubbb=123.123123123123124;
		System.out.printf("%f <- Esto es un double\n",doubbb);
		LineaGuionesConsola();
		System.out.printf("%n <- Añade una nueva linea\n");
		LineaGuionesConsola();
		System.out.printf("%% <- Añadir un porcentaje\n");
		LineaGuionesConsola();
		System.out.printf("%s%n", "Hola");
		System.out.printf("%S%n", "Hola");
		System.out.printf("%d%n", 10);
		System.out.printf("%d%n", 1234);
		System.out.printf("%f%n", 10.1234);
		System.out.printf("%.2f%n", 10.1234F);
		System.out.printf("%.3f%n", 10.1234);
		System.out.printf("\"%s\"%n", "Hola");
		System.out.printf("%d = cinco%n", 5);
		System.out.printf("%+d%n", 10);
		System.out.printf("%+d%n",10);
		System.out.printf("%d%%%n", 20);
		//Trabajando con varios valores a la vez
		System.out.printf("%1$s=%2$f%n", "PI",3.141592);
		System.out.printf("%2$f=%1$s%n", "PI",3.141592);
		System.out.printf("%3$S, %2$s%n, %1$s%n", "NOMBRE","APELLIDOS1","APELLIDO2");
		System.out.printf("%1$d x %1$d = %2$d%n",5,5*5);
		System.out.printf("%1$.2f x %1$.2f = %2$.2f%n",1.1234, 1.1234 *1.1234);
		// Ocupamos 10 espacios en total. Como solo tenemos 4 digitos los otros 6 serán espacios.
		//Por lo que el resultado sera: +1.12		
		System.out.printf("%+10.2f%n",1.1234);
		// Ocupamos 8 espacios en total. Como solo tenemos 6 digitos los otros 2 serán espacios.
		// Por lo que el resultado será: 1.1234
		System.out.printf("%8.2f%n",1.1234);
		// Ocupamos 20 espacios en total. Como solo tenemos 4 digitos los otros 16 serán 0.
		// Por lo que el resultado será: 0000000000000001.12
		System.out.printf("%020.2f%n",1.1234);
		// Ocupamos 10 espacios en total. Como solo tenemos 6 digitos dejamos 4 espacios a la izquierda.
		System.out.printf("%10s%n","Total:");
		//Ocupamos 10 espacios en total. como solo tenemos 6 digitos dejamos 4 espacios a la deracha de "Total: "
		System.out.printf("%-10s%n", "Total:");
	}
	public static void LineaGuionesConsola(){
		for(int i=0;i<100;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	public static void EjercicioPrintf(){
		System.out.printf("%s\t\t%s\t%s\n","NOMBRE","APELLIDO1","APELLIDO2");
		System.out.printf("%-10s%s%s\n","NOMBRE","apellido1","apellido2");
		System.out.printf("%3$s, %2$s, %1$s\n","Nombre","apellido1","apellido2");
		System.out.printf("%-10s\n","22");
		System.out.printf("%08d\n", 22);
		System.out.printf("%04.2f", 17.1829327);
		System.out.printf("%s \b %s","Hola", "Mundo");
	}
	public static void main(String[] args) {
		FuncionPrintf();
		EjercicioPrintf();

	}

}
