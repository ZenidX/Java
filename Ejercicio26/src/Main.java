
public class Main {
	public static void WrappingAutoboxing(){
		char caracter ='a';
		System.out.println(((Character) caracter).getClass().getName());
		System.out.println(((Object) caracter).getClass().getName());
	}
	public static void WrappingAutounboxing(){
		Character caracterWrapped='a';
		System.out.println(caracterWrapped.getClass().getName());
		char caracterUnwrapped = caracterWrapped;
		System.out.println(caracterUnwrapped);
	}
	public static void ConstructorDeprecated(){
		@SuppressWarnings("deprecation")
		Character caracterWrapped = new Character('a');
		System.out.println(caracterWrapped);
		System.out.println(caracterWrapped.getClass().getName());
	}
	public static void WrappingManualvalueOf(){
		int numPrimitive = 6;
		Integer numWrapper=Integer.valueOf(numPrimitive);
		System.out.println(numWrapper instanceof Object);
	}
	public static void DeswrappingManual() {
		Integer numWrapper=Integer.valueOf(6);
		int numUnWrapped=numWrapper.intValue();
		System.out.println(numUnWrapped);
	}
	public static void VARLocalVariableTypeInference(){
		var num=1;
		System.out.println(num);
		var var="ejemplo";
		System.out.println(var);
		var ejemplo="Ejemplo";
		System.out.println(ejemplo.getClass().getName());
		//ejemplo=1234;
		System.out.println(ejemplo.getClass().getName());
		String txt = "Hola";
		System.out.println(txt.getClass().getName());
		int udt =123;
		System.out.println(((Object)udt).getClass().getName());
	}
	public static void EjercicioObjetosWrappers() {
		Long exL = (long) 0;
		byte exb = 1;
		short exs = 2;
		Integer exI = Integer.valueOf(3);
		System.out.println(exL.getClass().getName());
		System.out.println(((Byte)exb).getClass().getName());
		System.out.println(((Short)exs).getClass().getName());
		System.out.println(exI.getClass().getName());
	}
	public static void EjercicioFuncionesWrappers(){
		Long exL = (long) 0;
		byte exb = 1;
		short exs = 2;
		Integer exI = Integer.valueOf(3);
		String exStr = "Papaya";
		FuncionEjercicioFuncionesWrappers(exL);
		FuncionEjercicioFuncionesWrappers(exb);
		FuncionEjercicioFuncionesWrappers(exs);
		FuncionEjercicioFuncionesWrappers(exI);
		FuncionEjercicioFuncionesWrappers(exStr);
	}
	public static void FuncionEjercicioFuncionesWrappers(Object a){
		System.out.println(a.getClass().getName());
	}
	public static void main(String[] args) {
		WrappingAutoboxing();
		WrappingAutounboxing();
		ConstructorDeprecated();
		WrappingManualvalueOf();
		DeswrappingManual();
		VARLocalVariableTypeInference();
		EjercicioObjetosWrappers();
		EjercicioFuncionesWrappers();
	}
}
