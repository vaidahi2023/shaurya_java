package Encapsualation;

class Area
{
	private double length;
	private double breadth;
	void setlength(double l)
	{
		this.length=l;	
	}
	void setbreadth(double b)
	{
		this.breadth=b;
	}
	double getlength()
	{
		return length;
	}
	double getbreadth()
	{
		return breadth;
	}
//	void area()
//	{
//		double area;
//		area=length*breadth;
//		System.out.println("arae of rectangle is "+area);
//	}
}
public class E1 {

	static Area a=new Area();
	static void area()
	{
		double area;
		area=a.getbreadth()*a.getlength();
		System.out.println("arae of rectangle is "+area);
	}
	public static void main(String[] args) {
		
		a.setbreadth(20);
		a.setlength(80);
		area();
	}
	
}
