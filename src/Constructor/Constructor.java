package Constructor;
//constructor is method without return type 
//constructor name should be class name
//it will call when the object 
/*
* types of constructor 
* 1.default constructor
* 2.parmeterized constructor
* 3.copy constructor */

public class Constructor {

	private int id;
	//default constructor
	Constructor()
	{
		System.out.println("default constructor");
	}
	//parameterized constructor
	Constructor(int id)
	{
		this.id=id;
		System.out.println("parameterized constructor");
		System.out.println("id="+id);
	}
	
	//copy constructor 
	Constructor(Constructor c)
	{
		this.id=c.id;
		System.out.println("copy constructor");
		System.out.println("id="+id);
	}
	public static void main(String[] args) {
		
		Constructor c=new Constructor();
		Constructor c1=new Constructor(12);
		Constructor c2=new Constructor(c1);
	}
}
