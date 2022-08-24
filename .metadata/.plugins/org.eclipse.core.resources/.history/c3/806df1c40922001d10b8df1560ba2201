package version01;

public class Laser extends Actor{//
	protected static final int BULLET_SPEED=15;//Definimos la velocidad de los laseres de los monstruos
	public Laser(Stage stage) {
		super(stage);//Llamamos al constructor de la stage
		setSpriteNames(new String [] {"disparo0.gif","disparo1.gif","disparo2.gif"});
		setFrameSpeed(10);
	}
	public void act() {
		super.act();
		y+=BULLET_SPEED;//Incrementamos la posición del laser la velocidad vertical del laser
		if(y>Stage.PLAY_HEIGHT){ //Si esta fuera de la 
			remove(); //Eliminamos el laser
		}
	}
}
