package version01;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Invaders extends Canvas implements Stage, KeyListener{
	private BufferStrategy strategy;
	private long usedTime;
	private SpriteCache spriteCache;
	private SoundCache soundCache;
	private ArrayList<Actor> actors;
	private Player player;
	private BufferedImage ocean;
	private int t;
	private boolean gameEnded=false;
	private boolean levelEnded=false;
	private int level=0;
	private int [] eLevel=new int[3];
	private int speed=100;
	private int enemies=0;
	public Invaders() {
		spriteCache = new SpriteCache(); //Cache de imagenes
		soundCache = new SoundCache();  //Cache de sonidos
		JFrame ventana = new JFrame("Invaders y papaya");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH,Stage.HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) { 
				System.exit(0);
			}
		});
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
		addKeyListener(this);
	}
	public void addSpeed(int i) {
		speed += i;		
	}
	public void initWorld(int enemiesLevel) {
		levelEnded=false;
		actors=new ArrayList<Actor>();
		for(int i=0;i<enemiesLevel;i++) {
			Monster m=new Monster(this);
			m.setX((int)(Math.random()*Stage.WIDTH));
			m.setY((int)(Math.random()*Stage.PLAY_HEIGHT*3/5));
			m.setVx((int)(Math.random()*20-10)+2); 
			m.setVy((int)(Math.random()*10-5));
			enemies++;
			actors.add(m);
		}
	}
	public void addActor(Actor a) {
		actors.add(a);
	}
	public void updateWorld() {
		int i=0;
		while(i<actors.size()){
			Actor m=(Actor)actors.get(i);
			if(m.isMarkedForRemoval()){
				if(m instanceof Monster){
					enemies--;
					actors.remove(i);
				}else{actors.remove(i);}
			}else {
				m.act();
				i++;
			}
		}
		player.act();
	}
	public Player getPlayer() {
		return player;
	}
	public void checkCollisions(){
		Rectangle playerBounds=player.getBounds();
		for(int i=0;i<actors.size();i++){
			Actor a1 =(Actor)actors.get(i);
			Rectangle r1=a1.getBounds();
			if(r1.intersects(playerBounds)){
				player.collision(a1);
				a1.collision(player);
			}
			for(int j=i+1;j<actors.size();j++){
				Actor a2 =(Actor)actors.get(j);
				Rectangle r2=a2.getBounds();
				if(r1.intersects(r2)){
					a1.collision(a2);
					a2.collision(a1);
				}
			}
		}
	}
	public void paintShields(Graphics2D g){ 
		g.setPaint(Color.red);
		g.fillRect(280, Stage.PLAY_HEIGHT, Player.MAX_SHIELDS, 30);
		g.setPaint(Color.blue); 
		g.fillRect(280+Player.MAX_SHIELDS-player.getShields(),Stage.PLAY_HEIGHT,player.getShields(),30);
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.setPaint(Color.blue);
		g.drawString("Shields", 200, Stage.PLAY_HEIGHT+20);
	}
	public void paintScore(Graphics2D g){
		g.setFont(new Font("Arial",Font.BOLD,20));g.setPaint(Color.green);
		g.drawString("Score:",80,Stage.PLAY_HEIGHT+20);
		g.setPaint(Color.red);
		g.drawString(player.getScore()+"", 140, Stage.PLAY_HEIGHT+20);
	}
	public void paintAmmo(Graphics2D g){
		int xBase=280+Player.MAX_SHIELDS+10;
		for(int i=0;i<player.getClusterBombs();i++) {
			BufferedImage bomb=spriteCache.getSprite("bombUL.gif");
			g.drawImage(bomb, xBase+i*bomb.getWidth(),Stage.PLAY_HEIGHT,this);
		}
	}
	public void paintLevel(Graphics2D g) {
		g.setFont(new Font("Arial",Font.BOLD,20));g.setPaint(Color.green);
		g.drawString("Level:",5,Stage.PLAY_HEIGHT+20);
		g.setPaint(Color.red);
		g.drawString((level+1)+"", 65, Stage.PLAY_HEIGHT+20);
	}
	public void paintfps(Graphics2D g) {
		g.setFont(new Font("Arial",Font.BOLD,12));g.setColor(Color.white);
		if(usedTime>0) {g.drawString(String.valueOf(1000/usedTime)+" fps", 5, Stage.PLAY_HEIGHT);
		         }else {g.drawString("--- fps",5,Stage.PLAY_HEIGHT);}
	}
	public void paintStatus(Graphics2D g) {
		paintScore(g);
		paintShields(g);
		paintAmmo(g);
		paintfps(g);
		paintLevel(g);
	}
	public void paintWorld(){
		Graphics2D g=(Graphics2D)strategy.getDrawGraphics();
		if(level==0){ocean = spriteCache.getSprite("ocean.gif");}
		if(level==1){ocean = spriteCache.getSprite("ocean.jpg");}
		if(level==2){ocean = spriteCache.getSprite("ocean1.jpg");}
		g.setPaint(new TexturePaint(ocean,new Rectangle(0,4*t+1920-640,ocean.getWidth(),ocean.getHeight())));
		g.fillRect(0, 0, getWidth(), getHeight());
		for(int i=0;i<actors.size();i++){ //
			Actor m=(Actor)actors.get(i);
			m.paint(g);
		}
		player.paint(g);
		paintStatus(g);
		strategy.show();
	}
	public SoundCache getSoundCache(){
		return soundCache;
	}
	public SpriteCache getSpriteCache() {
			return spriteCache;
	}
	public void keyPressed(KeyEvent e){
		player.keyPressed(e);
	}
	public void keyReleased(KeyEvent e){
		player.keyReleased(e);
	}
	public void keyTyped(KeyEvent e) {}
	public void levelOver(){
		levelEnded=true;
	}
	public void gameOver(){
		gameEnded =true;
	}
	public void paintLevelOver(){
		Graphics2D g =(Graphics2D)strategy.getDrawGraphics();
		g.setColor(Color.white);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("LEVEL COMPLETED", Stage.WIDTH/2-200, Stage.HEIGHT/2-50);
		strategy.show();
	}
	public void paintGameOver(){
		Graphics2D g =(Graphics2D)strategy.getDrawGraphics();
		g.setColor(Color.white);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("GAME OVER", Stage.WIDTH/2-150, Stage.HEIGHT/2);
		strategy.show();
	}
	public void game(){
		player=new Player(this);
		player.setX(Stage.WIDTH/2);
		player.setY(Stage.HEIGHT-3*player.getHeight());
		usedTime=1000; 
		t=0;
		eLevel[0]=10;
		eLevel[1]=20;
		eLevel[2]=50;
		while(isVisible() && !gameEnded && level<3) { 
			initWorld(eLevel[level]);
			addSpeed(-25);
			while(isVisible()&& !gameEnded && !levelEnded){
				t++;
				long startTime=System.currentTimeMillis();
				updateWorld();
				checkCollisions();
				if(enemies==0){levelOver();}
				paintWorld();
				usedTime=System.currentTimeMillis()-startTime;
				try {Thread.sleep(speed);
				}catch(InterruptedException e) {}
			}
			if(player.getShields()>=0){paintLevelOver();};
			try {Thread.sleep(2000);
			}catch(InterruptedException e) {}
			level++;
		}
		paintGameOver();
	}
	public static void main(String[] args) {
		Invaders inv=new Invaders(); 
		inv.game(); 
	}
}