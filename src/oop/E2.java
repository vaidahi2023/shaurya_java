package oop;

//Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, 
//and employee_salary. Provide public getter and setter methods to access and modify
//the id and name variables, but provide a getter method for the salary variable that returns a formatted string.

class employees
{
	private int id,salary;
	private String name;
	void setid(int id)
	{
		this.id=id;
	}
	void setname(String name)
	{
		this.name=name;
	}
	int getid()
	{
		return id;
	}
	String getname()
	{
		return name;
	}

}
public class E2 {

	public static void main(String[] args) {
		
		employees e=new employees();
		e.setid(1);
		e.setname("riya");
		System.out.println("id="+e.getid());
		System.out.println("name="+e.getname());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
