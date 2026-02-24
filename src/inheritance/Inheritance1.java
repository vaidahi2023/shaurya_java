package inheritance;

/*
 * Inheritance is the techquie of inherits parent class property to child class
 * 
 * extends is used to inherit the class
 * types of inheritance 
 * 1.single inheritance 
 * 2.multilevel inheritance
 * 3.multiple inheritance
 * 4.hirechacial inheritance
 * 5.hybrid inheritance
 */
class Parent 
{
	int id;
	String name;
	private int age;
	
	void display()
	{
		System.out.println("parent case...................................");
	}
}

class child extends Parent 
{
	void display1()
	{
		System.out.println("child class ............");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		
		child c=new child();
		c.display();
		c.display1();
		c.id=1;
		c.name="riya";
		System.out.println("id="+c.id);
		System.out.println("name="+c.name);
		c.age=12;
	}
}


