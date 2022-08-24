package version01;

public class Bullet extends Actor{//Clase de las balas del jugador, extensión de actor
	protected static final int BULLET_SPEED=10;//Definimos la velocidad vertical de la bala
	public Bullet(Stage stage) {
		super(stage);//Llamamos al constructor de la stage
		setSpriteNames(new String[] {"misil.gif"});//Asignamos el sprite del misil
	}
	public void act(){
		super.act();//Modificamos la actuacion de actor para la particular de la bala
		y-=BULLET_SPEED;//Incrementamos la posición de la bala la velocidad vertical
		if(y<0) {//Si sale por arriba 
			remove();//Se borra la bala
		}
	}
	public void collision(Actor a){//Aplicamos resultados segun tipo de colisión
		if(a instanceof Monster ) {//Si choca contra una montruo
			remove();
		}
	}
}
