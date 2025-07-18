package shaurya_java;

import java.util.Scanner;

//5=1*2*3*4*5

//classname objectname=new classname();
public class Function1 {

	void factorial()
	{
		int n,i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt(); //5
		for(i=1;i<=n;i++) //1<=5 2<=5 3<=5 4<=5 5<=5 6<=5
		{
			fact=fact*i; //fact=1*1=1 fact=1*2=2 fact=2*3=6*4=24*5=120 
		}
		System.out.println("factorial is "+fact);
	}
	//without argumnet without return 
	public static void main(String[] args) {
		
		Function1 f=new Function1();
		f.factorial();
	
	}
}
