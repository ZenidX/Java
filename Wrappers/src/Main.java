public class Main {
	Number[] arrayNumeros= {
		new Byte(1),
		new Short(2),
		new Integer(3),
		new Long(4),
		new Float(5),
		new Double(6)
	};
	public static void EjercicioWrappersMINMAX(){
		System.out.println("");
		for(Number Numb:arrayNumeros){
			System.out.println("Rango"+Numb.class()+" desde "+Numb.MIN_VALUE+" hasta "+Numb.MAX_VALUE);
		}
	}
	public static void main (String[] args){
		EjercicioWrappersMINMAX();
	}
}