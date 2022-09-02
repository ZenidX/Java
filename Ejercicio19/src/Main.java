
public class Main {
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
	public static void main(String[] args) {
		EjercicioEstructurasRepetitivas();
	}

}
