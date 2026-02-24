package abstraction;

/*
 * Abstraction in Java is the process of hiding internal implementation 
 * details and showing only essential functionality to the user. 
 * 
Java provides two ways to implement abstraction, which are listed below:

Abstract Classes (Partial Abstraction)
Interface (100% Abstraction)


 */

abstract class example 
{
	abstract void display();
}
public class Abstraction extends example{

	
	void display() {
	
		System.out.println("it is abstract class method");
	}

	public static void main(String[] args) {
		
		Abstraction a=new Abstraction();
		a.display();
		
		
	}
	
}
