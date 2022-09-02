
public class Main {
	public static void EjercicioFunciones(){
		// EJERCICIO DE FUNCIONES
		System.out.println(javaOrNull("java"));
		System.out.println(loginLogin("admin","1234"));
	}
	public static String javaOrNull(String javaxx){
			if(javaxx=="java"){
				return javaxx;
			}else{
				return null;
			}
		}
	public static String loginLogin(String account, String password){
		if(account=="admin" & password=="1234") {
			return "Login true";
		}else{
			return "Login false";
		}
	}
	public static void main(String[] args) {
		EjercicioFunciones();
	}
}
