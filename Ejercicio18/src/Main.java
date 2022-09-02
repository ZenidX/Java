
public class Main {
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
	public static void main(String[] args) {
		EjercicioDibujarArbolBucles();
	}
}
