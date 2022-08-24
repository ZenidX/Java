package version01;

public class Monster extends Actor {//Creamos la clase de los monstruos, extensión de actor
	protected int vx; 
	protected int vy;
	protected static final double FIRING_FREQUENCY=0.01; //Frecuencia de tiro
	public Monster(Stage stage) {
		super(stage); //Llamamos al contructor del escenario
		setSpriteNames(new String[] {"bicho0.gif","bicho1.gif"}); //
		setFrameSpeed(35);//
	}
	public void act(){//Actuación de los mosntruos
		super.act();//Modificamos la actuación del actor para la particular de un mosntruo
		x+=vx;//Incremento  
		y+=vy;
		if(x<0||x>Stage.WIDTH){//Si toca un vorde  
			vx=-vx;
		}
		if(y<0||y>Stage.PLAY_HEIGHT*3/5) {
			vy=-vy;
		}
		if(Math.random()<FIRING_FREQUENCY){//Tiro segun random sea menor que la frecuencia de tiro
			fire();//Dispara laser
		}
	}
	public int getVx() {return vx;}//Tomar velocidad
	public void setVx(int i){vx=i;}//Asignar velocidad
	public int getVy() {return vy;}//Tomar velocidad
	public void setVy(int i){vy=i;}//Asignar velocidad
	public void collision(Actor a){//Aplicamos resultados segun tipo de colisión
		if(a instanceof Bullet || a instanceof Bomb) {//Si choca contra una bala o una bomba
			remove();//Se borra el monstruo
			stage.getSoundCache().playSound("explosion.wav");//Accedemos al cache de sonido y reproducimos el sonido explosion
			//spawn();//Reaparece otro monstruo
			stage.getPlayer().addScore(20); //Tomamos al jugador y le añadimos 20 puntos a la puntuación
		}
	}
	public void spawn(){//Reaparecer otro monstruo
		Monster m=new Monster(stage); //Creamos el monstruo en la stage
		m.setX((int)(Math.random()*Stage.WIDTH)); //Situamos el monstruo horizontalmente random
		m.setY((int)(Math.random()*Stage.PLAY_HEIGHT*3/5)); //Situamos el monstruo verticalmente en los 3 primeros quintos del panel
		m.setVx((int)(Math.random()*20-10)); //Le aportamos una velocidad horizontal random
		m.setVy((int)(Math.random()*10-5)); //Le aportamos una velocidad horizontal random
		stage.addActor(m); //Lo añadimos como actor a la stage
	}
	public void fire(){//Disparo laser
		Laser m=new Laser(stage); //Creamos el laser en la stege
		m.setX(x+getWidth()/2); //Posicionamos la media horizonral del mosntruo el laser
		m.setY(y+getHeight()); //Posicionemos por debajo del monstruo el laser
		stage.addActor(m); //Lo añadimos como actor a la stage
		stage.getSoundCache().playSound("photon.wav"); //Accedemos al cache de sonido y reproducimos el sonido del laser
	}
}
