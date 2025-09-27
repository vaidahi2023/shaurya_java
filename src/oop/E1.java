package oop;

public class E1 {

	private String name;
	void setname(String name)
	{
		this.name=name;	
	}
	String getname()
	{
		return name;
	}
	public static void main(String[] args) {
		
		E1 e=new E1();
		e.setname("het");
		System.out.println("name="+e.name);
		System.out.println("name="+e.getname());
	}
}
