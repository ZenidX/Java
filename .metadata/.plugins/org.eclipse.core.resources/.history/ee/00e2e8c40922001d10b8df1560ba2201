package version01;

import java.awt.image.BufferedImage; //Funciones para tener imagenes cargadas
import java.net.URL; //Funciones para acceder a archivos segun nombre
import javax.imageio.ImageIO; //Funciones para la lectura de archivos imagen

public class SpriteCache extends ResourceCache{
	protected Object loadResource(URL url) {//Intentar cargar imagen segun en nombre
		try { return ImageIO.read(url); //Intentar leer el archivo imagen segun en nombre
		}catch(Exception e) { //Error de cargar imagen
			System.out.println("No se pudo cargar la imagen de "+url);  //Nombre del archivo fallido
			System.out.println("El error fue: "+e.getClass().getName()+" "+e.getMessage()); 
			System.exit(0); //acabar el programa
			return null; //nadata
		}
	}
	public BufferedImage getSprite(String name) { //tomar recursos cargado segun nombre
		return (BufferedImage)getResource(name);  //Devolvemos un objeto imagen
	}
}
