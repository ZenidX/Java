package version01;

import java.awt.event.KeyEvent; //Funciones para acceder a teclado

public class Player extends Actor{//Creamos las clase del jugador, extension de actor
	public static final int MAX_SHIELDS=200;  //Cantidad de escudo inicial
	public static final int MAX_BOMBS=5;      //Cantidad de bombas que se pueden disparar al empezar
	protected static final int PLAYER_SPEED=8;//Velocidad en pixeles por TURNO del jugador 
	protected int vx; //Variable para la velocidad horizontal
	protected int vy; //Variable para la velocidad vertical
	protected boolean up, down, left, right; //Variables buleanas para los botones de dirección.
	private int clusterBombs; //Variable para
	private int score;  //Variable para
	private int shields;//Variable para el escudo 
	public Player(Stage stage) {//El constructor del jugador
		super(stage); //Llamamos al contructor del escenario
		setSpriteNames(new String[] {"nave.gif"});//Asignamos el sprite de la nave
		clusterBombs=MAX_BOMBS; //Asignamos las bombas iniciales
		shields=MAX_SHIELDS; //Asignamos el escudo inicial
		score=0; //Asignamos la puntuación inicial
	}
	public void act() {//Actuacion del jugador
		super.act();//Modificamos la actuación del actor para la particular de un jugador
		x+=vx; //Incremento en la posición horizontal segun la velocidad horizontal
		y+=vy; //Incremento en la posición vertical segun la velocidad vertical
		if(x<0){ //Si nos salimos del panel por la izquierda
			x=0; //Se detiene solo
		}
		if(x>Stage.WIDTH-getWidth()){//Si nos salimos del panel por la derecha
			x=Stage.WIDTH-getWidth();//Se detiene solo su anchura a la izquierda
		}
		if(y<0){//Si nos salimos del panel por arriba
			y=0;//Se detiene solo
		}
		if(y>Stage.HEIGHT-getHeight()){//Si nos salimos del panel por abajo
			y=Stage.PLAY_HEIGHT-getHeight();//Se detiene solo su altura arriba
		}
	}
	public int getVx(){return vx;} //Tomamos velocidad horizontal
	public int getVy(){return vy;} //Tomamos velocidad vertical
	public void setVx(int i){vx=i;}//Asignamos velocidad horizontal
	public void setVy(int i){vy=i;}//Asignamos velocidad vertical
	protected void updateSpeed(){ //Modificamos las velocidades  
		vx=0;vy=0;//Iniciamos la velocidad en estar quito
		if(down) vy= PLAYER_SPEED;//actualizamos el valor de la velocidad vertical segun el valor de boton abajo
		if(up)   vy=-PLAYER_SPEED;//actualizamos el valor de la velocidad vertical segun el valor de boton arriba
		if(left) vx=-PLAYER_SPEED;//actualizamos el valor de la velocidad horizontal segun el valor de boton izquierda
		if(right)vx= PLAYER_SPEED;//actualizamos el valor de la velocidad horizontal segun el valor de boton derecha
	}
	public void keyReleased(KeyEvent e){//Vemos si se han abandonado los botones
		switch(e.getKeyCode()){//Tomamos teclas activadas
			case KeyEvent.VK_DOWN : down =false;break;//Se ha dejado de presionar el boton abajo     down  pasa a false 
			case KeyEvent.VK_UP   : up   =false;break;//Se ha dejado de presionar el boton arriba    up    pasa a false 
			case KeyEvent.VK_LEFT : left =false;break;//Se ha dejado de presionar el boton izquierda left  pasa a false 
			case KeyEvent.VK_RIGHT: right=false;break;//Se ha dejado de presionar el boton derecha   right pasa a false 
		}
		updateSpeed();//Modificamos las velocidades
	}
	public void keyPressed(KeyEvent e){//Vemos si se han activado los botones
		switch(e.getKeyCode()) {//Tomamos teclas activadas
			case KeyEvent.VK_DOWN : down =true;break;//Se ha presionado el boton abajo     down  pasa a true
			case KeyEvent.VK_UP   : up   =true;break;//Se ha presionado el boton arriba    up    pasa a true
			case KeyEvent.VK_LEFT : left =true;break;//Se ha presionado el boton izquierda left  pasa a true
			case KeyEvent.VK_RIGHT: right=true;break;//Se ha presionado el boton derecha   right pasa a true
			case KeyEvent.VK_SPACE : fire();break;//Se ha presionado el boton espacio llamamos a la función para disparar
			case KeyEvent.VK_B: fireCluster();break; //Se ha presionado el boton B       llamamos a la funcion para lanzar bombas
			case KeyEvent.VK_R: clusterBombs=MAX_BOMBS;break; //Se ha presionado el boton R recargamos el numero de bombas disponibles.
		}
		updateSpeed();//Modificamos las velocidades
	}
	public void fire(){//Función de disparar 
		Bullet b=new Bullet(stage);//Creamos nueva bala en la stage
		b.setX(x);//Posición horizontal la misma que la del jugador
		b.setY(y-b.getHeight());//Posición vertical poco por encima de la del jugador
		stage.addActor(b); //Añadimos la bala como actor en stage
		stage.getSoundCache().playSound("missile.wav"); 
	}
	public void fireCluster() {//Función de lanzar bombas
		if(clusterBombs==0) {//Si el numero de bombas disponibles es 0
			return; //Nada
		}
		clusterBombs--;//Quitamos una bomba
		stage.addActor(new Bomb(stage,Bomb.UP_LEFT   ,x,y));//añadimos un actor bomba a la stage hacia arriba a la izquierda
		stage.addActor(new Bomb(stage,Bomb.UP        ,x,y));//añadimos un actor bomba a la stage hacia arriba 
		stage.addActor(new Bomb(stage,Bomb.UP_RIGHT  ,x,y));//añadimos un actor bomba a la stage hacia arriba a la derecha
		stage.addActor(new Bomb(stage,Bomb.LEFT      ,x,y));//añadimos un actor bomba a la stage hacia la izquierda
		stage.addActor(new Bomb(stage,Bomb.RIGHT     ,x,y));//añadimos un actor bomba a la stage hacia la derecha
		stage.addActor(new Bomb(stage,Bomb.DOWN_LEFT ,x,y));//añadimos un actor bomba a la stage hacia abajo a la izquierda
		stage.addActor(new Bomb(stage,Bomb.DOWN      ,x,y));//añadimos un actor bomba a la stage hacia abajo
		stage.addActor(new Bomb(stage,Bomb.DOWN_RIGHT,x,y));//añadimos un actor bomba a la stage hacia abajo a la derecha
	}
	public int getScore(){return score;}  //Tomamos       puntuación
	public void setScore(int i){score=i;} //Asignamos     puntuación
	public void addScore(int i){score+=i;}//Incrementamos puntuación
	public int getShields(){return shields;}  //Tomamos       cantidad de escudo
	public void setShields(int i){shields=i;} //Asignamos     candidad de escudo
	public void addShields(int i){shields+=i;}//Incrementamos cantidad de escudo
	public int getClusterBombs(){return clusterBombs;} //Tomamos   cantidad de bombas
	public void setClusterBombs(int i){clusterBombs=i;}//Asignamos cantidad de bombas
	public void collision(Actor a){//Aplicamos resultados segun tipo de colisión
		if(a instanceof Monster){//Si choca contra un mosntruo
			a.remove();      //se borra el mosntruo
			addScore(40);    //Añadimos 40 puntos a la puntuación
			addShields(-40); //Quitamos 40 puntos a la cantidad de escudo
		}
		if(a instanceof Laser){//Si choca contra un laser
			a.remove();      //Se borra el laser
			addShields(-20); //Quitamos 10 puntos a la cantidad de escudo
		}
		if(getShields()<0){ //Si la cantidad de escudo es negativa
			stage.gameOver(); //Terminamos el juego
		}
	}
}
