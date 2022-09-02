
public class Main {
	public static void EjercicioOperadoresIncrementales() {
		int a=0;
		int b=a++;
		System.out.println("a++="+(a++)+", a="+a+", b="+b);
		b=++a;
		System.out.println("a++="+(++a)+", a="+a+", b="+b);
		a=3;
		b=a--;
		System.out.println("a--="+(a--)+", a="+a+", b="+b);
		b=--a;
		System.out.println("a--="+(--a)+", a="+a+", b="+b);
	}
	public static void main(String[] args) {
		EjercicioOperadoresIncrementales();
	}

}
