package oop;

//what is Encapsalution
//Encapsalution  is the process of wrapping data in single unit .

class D1
{
	private int x;
	void setx(int x)
	{
		this.x=x;
	}
	int getx()
	{
		return x;
	}
}

public class Encapsalution {
	
	public static void main(String[] args) {
		

			D1 d=new D1();
			d.setx(12);
			System.out.println("x="+d.getx());
	}

	

}

//write a program that contain  circle class with private 
//data member raduuis and find the area of circle and also take the value of pi=3.14



//write the program of employee class and it contain data member that are id,name 