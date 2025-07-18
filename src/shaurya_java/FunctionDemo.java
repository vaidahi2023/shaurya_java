package shaurya_java;
/*
 *  types of function
 * 1.without argument without return
 * 2.without argument with return
 * 3.with argument with return
 * 4.with argument without return 
 */

import java.util.Scanner;

public class FunctionDemo {

	//without argument without return
//	void sum()
//	{
//		int a,b,sum=0;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the value:");
//		a=s.nextInt();
//		b=s.nextInt();
//		sum=a+b;
//		System.out.println("sum="+sum);
//	}
	
	//without argument with return
	int sum()
	{
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
	
		FunctionDemo f=new FunctionDemo();
		int sum=0;
		sum=f.sum();
		System.out.println("sum of number is "+sum);
	}
}
