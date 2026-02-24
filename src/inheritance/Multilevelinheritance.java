package inheritance;
class A 
{
	void display()
	{
		System.out.println("it is class A method");
	}
}
class B extends A 
{
	void display1()
	{
		System.out.println("it is class B method");
	}
	
}
class C extends B 
{
	void display2()
	{
		System.out.println("it is class C method");
	}
}
public class Multilevelinheritance {
	public static void main(String[] args) {
	
		C c=new C();
		c.display();
		c.display1();
		c.display2();
	}
}
