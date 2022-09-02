
public class Main {

	public static void recursividad(int a,int b){
		System.out.print(a+", ");
		a++;
		if(a<b){
			recursividad(a,b);
		}
	}
	public static void EjercicioRecursividad(int a,int fib1, int fib2, int fib){
		String[] tecnologies={"Markadown","RegExp","CSS","JS","SQL","Java","HTML"};
		System.out.println(tecnologies[a]);
		if(fib==0){
			fib1=1;
			fib2=1;
			System.out.print(fib1+", "+fib2+"\n");
		}
		if(fib%2==0){
			fib1=fib1+fib2;
			System.out.print(fib1+", ");
		}else{
			fib2=fib1+fib2;
			System.out.print(fib2+", ");
		}
		fib++;
		if(tecnologies[a]!="HTML"){
			EjercicioRecursividad(a+1,fib1,fib2,fib);
		}
	}
	public static void InvertirSupercalifragi(int a) {
		char[] palabrota=("supercalifragilisticoespialidoso").toCharArray();
		System.out.print(palabrota[palabrota.length-1-a]);
		if(a!=31){
			InvertirSupercalifragi(a+1);
		}
	}
	public static void main(String[] args) {
		recursividad(5,25);
		EjercicioRecursividad(0,123,123,0);
		InvertirSupercalifragi(0);
	}
}
