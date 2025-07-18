package shaurya_java;

import java.util.Scanner;

/*
 * types of function
 * 1.without argument without return
 * 2.without argumnet with return
 * 3.with argument with return
 * 4.with argument without return
 */
public class Function {
	
	//wawr
//	void sum()
//	{
//		int a=10,b=10;
//		System.out.println("sum="+(a+b));	
//	}
//	wo argu w return
//	int sum()
//	{
//		int a=10,b=20,add=0;
//		add=a+b;
//		return add;
//	}
	//wi argu wi return
//	int sum(int a,int b)
//	{
//		int add=0;
//		add=a+b;
//		return add;
//	}
	//factorial of 5 
	//1*2*3*4*5=
	
//	//with argument with return
//	int factorial(int n)
//	{
//		int i,fact=1;
//		for(i=1;i<=n;i++)
//		{
//			fact=fact*i;
//		}
//		return fact;
//	}
	//
	public static void main(String[] args) {
		
		Function f=new Function();
		int n,fact;
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		fact=f.factorial(n);
		System.out.println("factorial of number="+fact);
		
	}

}
