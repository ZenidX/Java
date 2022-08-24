package version01;

import java.awt.image.ImageObserver; //La verdade

public interface Stage extends ImageObserver{//La interfaz del escenario
	public static final int WIDTH=640;//
	public static final int HEIGHT=480;
	public static final int PLAY_HEIGHT=400;
	public SpriteCache getSpriteCache(); //Tomar imagen
	public SoundCache getSoundCache(); //Tomar sonido
	public void addActor(Actor a); //Añadir actor
	public Player getPlayer(); //Tomar jugador
	public void gameOver(); //Se acabo
}
