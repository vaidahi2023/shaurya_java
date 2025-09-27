package shaurya_java;
//encapsulation is one of the core concepts of Object Oriented Programming (OOP) in which we bind the data members and methods into a single unit. 
//Encapsulation is used to hide the implementation part and show the functionality for better readability and usability. 
public class Encapsaulation {

	private int a;
	void seta(int a)
	{
		this.a=a;
	}
	int geta()
	{
		return a;
	}
	public static void main(String[] args) {
		
		Encapsaulation e=new Encapsaulation();
		e.seta(12);
		System.out.println(e.geta());
	}
}
