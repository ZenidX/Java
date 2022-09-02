
public class Main {
	public static void EjercicioConcatenacionCadenas() {
		// EJERCICIO DE CONCATENACIÓN DE CADENAS
		String nombreconcat = "Xavi";
		String apelliconcat = "Lara Moreno";
		String calle_concat = "C/Pirineus 17";
		String municiconcat = "Sant Cugat del Vallès";
		String postZPconcat = "08195";
		char   sexo__concat = 'M';
		String email_concat = "zenid77@gmail.com";
		String datos = nombreconcat+" "+apelliconcat+", "+calle_concat+", "+municiconcat+" "+postZPconcat+", "+sexo__concat+", "+email_concat;
		System.out.println(datos);
		System.out.println("\n\n\n");	
	}
	public static void main(String[] args) {
		EjercicioConcatenacionCadenas();
	}

}
