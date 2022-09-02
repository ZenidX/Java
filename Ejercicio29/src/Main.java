import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Alumno> AlumnosList = new ArrayList<Alumno>();
		AlumnosList.add(new Alumno("Pulp Fiction", "2002", "Tarantino",1));
		AlumnosList.add(new Alumno("Kill Bill", "2005", "Tarantino",1));
		AlumnosList.add(new Alumno("Rocky", "2007", "Stalonne",1));
		System.out.printf("%20s%20s%20s%20s%n", "Nombre ", "Apellidos", "Curso", "Año");
		System.out.println("\t------------------------------------------------------------------------");
		for (Alumno estudiante : AlumnosList) {
			System.out.printf("%20s%20s%20s%20d%n",estudiante.nombre, estudiante.apellidos, estudiante.curso, estudiante.año);
		}
		System.out.printf("%-20s%-20s%-20s%-20s%n", "Nombre ", "Apellidos", "Curso","Año");
		System.out.println("------------------------------------------------------------------------");
		for (Alumno estudiante : AlumnosList) {
			System.out.printf("%-20s%-20s%-20s%-20d%n", estudiante.nombre, estudiante.apellidos, estudiante.curso, estudiante.año);
		}
	}
	public static class Alumno {
		String nombre = "";
		String apellidos = "";
		String curso = "";
		int año = 0;
		public String getNombre(){return nombre;}
		public String getApellidos(){return apellidos;}
		public String getCurso(){return curso;}
		public int getAño(){return año;}
		public void setNombre(String nombre) {this.nombre = nombre;}
		public void setDirector(String director){this.apellidos = director;}
		public void setCurso(String curso){this.curso=curso;}
		public void setAño(int año){this.año = año;}
		public Alumno(String nombre, String apellidos, String curso,int año){
			super();
			this.nombre = nombre;
			this.apellidos=apellidos;
			this.curso=curso;
			this.año = año;
		}
	}
}