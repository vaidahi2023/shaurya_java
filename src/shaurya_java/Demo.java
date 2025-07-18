package shaurya_java;

import java.util.Scanner;

public class Demo {

	int id;
	String name;
	
	public static void main(String[] args) {
		//object creation
		Scanner s=new Scanner(System.in);
		Demo d=new Demo();
		System.out.println("Enter your id");
		d.id=s.nextInt();
		System.out.println("Enter your name");
		d.name=s.next();
//		d.id=1;
//		d.name="ram";
		Demo d1=new Demo();
		d1.id=2;
		d1.name="amit";
		System.out.println("id="+d.id);
		System.out.println("name ="+ d.name);
		System.out.println("id="+d1.id);
		System.out.println("name="+d1.name);
	}
}
