package version01;

import java.awt.Graphics2D;//Pah printar cosas en el panel...
import java.awt.Rectangle; //Funciones para hacer rectangulos e intersectarlos 
import java.awt.image.BufferedImage; //Funciones para la carga de imagenes

public class Actor {
	protected int x,y; //Posicion del actor
	protected int width, height; //Anchura y altura del actor 
	protected String[] spriteNames; //Lista de imagenes del actor(animacion)
	protected int currentFrame;
	protected int frameSpeed;
	protected int t; 
	protected Stage stage;
	protected SpriteCache spriteCache;
	protected boolean markedForRemoval;
	public Actor(Stage stage) {
		this.stage=stage;
		spriteCache=stage.getSpriteCache();
		currentFrame=0;
		frameSpeed=1;
		t=0;
	}
	public void remove() {
		markedForRemoval = true;
	}
	public boolean isMarkedForRemoval() {
		return markedForRemoval;
	}
	public void paint(Graphics2D g) {
		g.drawImage(spriteCache.getSprite(spriteNames[currentFrame]), x,y, stage);
	}
	public int getX(){return x;}
	public int getY(){return y;}
	public void setX(int i){x=i;}
	public void setY(int i){y=i;}
	public int getFrameSpeed() {return frameSpeed;}
	public void setFrameSpeed(int i){frameSpeed=i;}
	public void setSpriteNames(String[] names) {
		spriteNames=names;
		height=0;
		width=0;
		for(int i=0;i<names.length;i++) {
			BufferedImage image=spriteCache.getSprite(spriteNames[i]);
			height=Math.max(height, image.getHeight());
			width=Math.max(width, image.getWidth());	
		}
	}
	public int getHeight(){return height;}
	public int getWidth(){return width;}
	public void setHeight(int i){height=i;}
	public void setWidth (int i){width=i;}
	public Rectangle getBounds() {
		return new Rectangle(x,y,width,height);
	}
	public void collision(Actor a){}
	public void act() {
		if(t%frameSpeed==0) {
			t=0;
			currentFrame=(currentFrame+1)%spriteNames.length;
		}
	}
}
