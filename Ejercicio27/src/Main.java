
public class Main {
	public static void Conversiones(){
		byte numByte=123;
		System.out.println(numByte);
		short numShort01=numByte;
		System.out.println(numShort01);
		int numInt=1235432787;
		System.out.println(numInt);
		//short numShort02 = numInt;
		System.err.println((short)numInt);
		//Conversión por asignación.
		int numInteger=25;
		long numLong=numInteger;
		float numFloat=numLong;
		System.out.println("Valor Int\t"+numInteger);
		System.out.println("Valor Long\t"+numLong);
		System.out.println("Valor Float\t"+numFloat);
		//Convesión por promoción aritmética
		double num1=123;
		int num2=123;
		double result=num1*num2;
		System.out.println(result);
		//Convesión manual casting
		double numDouble = 99999.12345;
		System.out.println(numDouble);
		int numInt1 = (int) numDouble;
		System.out.println(numInt1);
		double numDouble2=Double.MAX_VALUE;
		System.out.println(numDouble2);
		float numFloat2=(float) numDouble2;
		System.out.println(numFloat2);
		long numLong2 = (long) numFloat2;
		System.out.println(numLong2);
		int numInt2=(int) numLong2;
		System.out.println(numInt2);
		short numShort2=(short)numInt2;
		System.out.println(numShort2);
		byte numByte2=(byte)numShort2;
		System.out.println(numByte2);
		//Convesión manual con Wrappers
		String txt="9";
		System.out.println(txt+" es un "+txt.getClass().getSimpleName());
		int numero = Integer.parseInt(txt);
		System.out.println(numero+" es un "+Integer.valueOf(numero).getClass().getSimpleName());
	}
	public static void EjercicioConversiones() {
		//1
		double numDouble=Double.MAX_VALUE;
		System.out.println(numDouble);
		float numFloat=(float) numDouble;
		System.out.println(numFloat);
		long numLong=(long) numFloat;
		System.out.println(numLong);
		int numInt=(int) numLong;
		System.out.println(numInt);
		short numShort=(short)numInt;
		System.out.println(numShort);
		byte numByte=(byte)numShort;
		System.out.println(numByte);
		numShort=numByte;
		System.out.println(numShort);
		numInt=numShort;
		System.out.println(numInt);
		numLong=numInt;
		System.out.println(numLong);
		numFloat=numLong;
		System.out.println(numFloat);
		numDouble=numFloat;
		System.out.println(numDouble);
		byte byteIni=100;
		byteIni=((byte)((int)byteIni*2));
		System.out.println(byteIni);
	}
	public static void main(String[] args) {
		Conversiones();
		EjercicioConversiones();
	}
}
