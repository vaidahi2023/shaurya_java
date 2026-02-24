package Encapsualation;

class Student 
{
	private int id;
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
}
public class Encapsualation {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setid(2);
		System.out.println("id="+s.getid());
		
	}
}
