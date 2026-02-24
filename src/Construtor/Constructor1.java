package Construtor;

public class Constructor1 {

	int id;
	int marks[];
	Constructor1(int id,int marks[])
	{
		this.id=id;
		this.marks=marks;
	}
	void print()
	{
		System.out.println("id="+id);
		System.out.println("student marks:");
		for(int m:marks)
		{
			System.out.println(m);
		}
	}
	
	public static void main(String[] args) {
		
		int marks[]= {12,34,56,89,90};
		Constructor1 c=new Constructor1(12, marks);
		c.print();
		
	}
}
