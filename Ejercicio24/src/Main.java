
public class Main {
	public static void EjercicioColoresBanderasANSI(){
		final int RED    = 196;
		final int YELLOW = 226;
		final int BLUE   =  21;
		final int WHITE  = 255;
		final int BLACK  =   0;
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
	public static void main(String[] args) {
		EjercicioColoresBanderasANSI();
	}
}
