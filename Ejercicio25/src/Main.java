
public class Main {

	public static void InvocarValorBooleanoObjeto(){
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
	}
	public static void RendimientoCurrentTimeMillis(){
		long start = System.currentTimeMillis();
		long finish;
		Long noPrimitivo = 0L;
		for(long i=0;i<Integer.MAX_VALUE;i++){
			noPrimitivo+=i;
		}
		finish=System.currentTimeMillis();
		System.out.println("Rendimiento cuando trabajamos con Float (objeto): "+(finish-start)+"ms");
		start=System.currentTimeMillis();
		long primitivo =0L;
		for(long i=0;i<Integer.MAX_VALUE;i++){
			System.out.println(primitivo);
			primitivo+=i;
		}
		finish=System.currentTimeMillis();
		System.out.println("Rendimiento cuando trabajamos con float (primitivo): "+(finish-start)+"ms");
	}
	public static void EjercicioWrappers(){
		System.out.println("");
		System.out.println("Rango de byte   desde "+Byte.MIN_VALUE   +"\t\t\t hasta "+Byte.MAX_VALUE);
		LineaGuionesConsola();
		System.out.println("Rango de short  desde "+Short.MIN_VALUE  +"\t\t\t hasta "+Short.MAX_VALUE);
		LineaGuionesConsola();
		System.out.println("Rango de int    desde "+Integer.MIN_VALUE+"\t\t hasta "+Integer.MAX_VALUE);
		LineaGuionesConsola();
		System.out.println("Rango de long   desde "+Long.MIN_VALUE   +"\t hasta "+Long.MAX_VALUE);
		LineaGuionesConsola();
		System.out.println("Rango de float  desde "+Float.MIN_VALUE  +"\t\t\t hasta "+Float.MAX_VALUE);
		LineaGuionesConsola();
		System.out.println("Rango de double desde "+Double.MIN_VALUE +"\t\t\t hasta "+Double.MAX_VALUE);
		LineaGuionesConsola();
	}
	public static void LineaGuionesConsola(){
		for(int i=0;i<100;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	public static void EjercicioDescripcionObjetoMetodos(){
		System.out.println("El tipo de dato:\t"+Byte.TYPE);
		System.out.println("Está formado por:\t"+Byte.SIZE);
		System.out.println("Su rango es:\t"+Byte.MIN_VALUE+" ---- "+Byte.MAX_VALUE);
	}
	public static void main(String[] args){
		InvocarValorBooleanoObjeto();
		RendimientoCurrentTimeMillis();
		EjercicioWrappers();
		EjercicioDescripcionObjetoMetodos();
	}
}
