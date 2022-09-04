
public class Main {
	public static void main(String[] args) {
		Car Renault=new Car("Renault",10,10,120);
		Car Hyundai=new Car("Hyundai",5,7.5,80);
		Car SeatAro=new Car("Seat Arona",10,5,140);
	}
}
class Car{
	String nombre;
	private double fuel;
	private double consum;
	private double speed;
	final double maxspeed=220;
	final double minspeed=-120;
	public void refuel(){
		this.fuel=40;
	}
	public void setSpeed(double s) {
		if(s>maxspeed){
			this.speed=maxspeed;
		}else if(s>minspeed){
			this.speed=s;
		}else {
			this.speed=minspeed;
		}
	}
	public void setConsum(double consum){
		this.consum=consum;
	}
	public double getFuel(){
		return this.fuel;
	}
	public double getSpeed(){
		return this.speed;
	}
	public double getConsum(){
		return this.consum;
	}
	public void drive(){
		System.out.println("Gasolina actual: "+this.fuel);
		System.out.println("Conduciendo el coche una hora a "+this.speed+"km/h.");
		this.fuel=this.fuel-this.consum*100/this.speed;
		System.out.println("Gasolina actual: "+this.fuel);
	}
	public Car(String nom, double fuel, double consum, double speed){
		this.nombre=nom;
		this.fuel=fuel;
		this.consum=consum;
		this.speed=speed;
	}
	public Car(String nom){
		this.nombre=nom;
	}
	public Car(){
	}
}