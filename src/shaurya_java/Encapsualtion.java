package shaurya_java;
class Student 
{
	private int id;
	String name;
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
}

public class Encapsualtion {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="riya";
		s.setid(1);
		System.out.println("id="+s.getid());
		
	}
}