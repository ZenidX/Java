
public class Main {
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
		System.out.println("\033[4mESPAÑA\033[0m");
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
		System.out.println("\033[9mCATALUÑA\033[0m");
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
	public static void main(String[] args) {
		EjercicioColoresBanderasANSI();
	}
}
