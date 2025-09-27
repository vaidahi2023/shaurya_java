package shaurya_java;

import java.util.Scanner;

public class Student {

	int id ;
	String name;
	void display()
	{
		System.out.println("id="+id);
		System.out.println("name="+name);
	}
	public static void main(String[] args) {
		
		Student s=new Student();
//		s.id=1;
//		s.name="shlok";
//		s.display();
//		Student s1=new Student();
//		s1.id=2;
//		s1.name="riya";
//		s1.display();
		
		Scanner a=new Scanner(System.in); 
		System.out.println("Enter the id:");
		s.id=a.nextInt();
		a.nextLine();
		System.out.println("Enter the name:");
		s.name=a.nextLine();
		s.display();
	}
	
}

//employee
//--id,name,salary,role 
//display()-- yearly 

