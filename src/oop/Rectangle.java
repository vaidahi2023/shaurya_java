package oop;

public class Rectangle {

	private int length,breadth;
	void setlength(int length)
	{
		this.length=length;
	}
	void setBreadth(int breadth)
	{
		this.breadth=breadth;
	}
	int getlength()
	{
		return length;
	}
	int getbreadth()
	{
		return breadth;
	}
	void area()
	{
		int area=0;
		area=length*breadth;
		System.out.println("area="+area);
	}
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();
		r.setlength(10);
		r.setBreadth(20);
		r.area();
		
	}
}
