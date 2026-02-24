package inheritance;
//
class Vehicle 
{
	int modelno;
	Vehicle(int modelno)
	{
		this.modelno=modelno;
	}
}
class Car extends Vehicle
{
	String color;
	Car(String color,int modelno)
	{
		super(modelno);
		this.color=color;
	}
	
}
class Bike extends Vehicle
{
	int speed;
	Bike(int modelno,int speed)
	{
		super(modelno);
		this.speed=speed;
	}
	void display()
	{
		System.out.println("modelno ="+ modelno);
		System.out.println("speed="+speed);
	}
}
class ElectricCar extends Car 
{

	int battery;
	ElectricCar(String color, int modelno,int b) {
		super(color, modelno);
		this.battery=b;
		
	}
	void display()
	{
		System.out.println("modelno ="+ modelno);
		System.out.println("Battery="+battery);
		System.out.println("color="+color);
	}
	
}
public class Hybrid1 {

public static void main(String[] args) {
	
	ElectricCar c=new ElectricCar("blue", 10, 30);
	c.display();
}
	
}
