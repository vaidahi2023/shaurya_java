package polymoriphm;

class Parent 
{
	void display()
	{
		System.out.println("parent class method");
	}
}
class Child extends Parent 
{
	void display()
	{
		super.display();
		System.out.println("it is child class method");
	}
}
public class Runpolymoriphm {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
		
	}
	
}
