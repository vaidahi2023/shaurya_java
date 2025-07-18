package shaurya_java;

import java.util.Scanner;

/*
 * for(intialization;condition;increment/decrement)
 * {
 * 		
 * }
 * 5 
 * 1*2*3*4*5=120
 * prime number ?
 * 5 =1,5
 * 
 */
public class For {

	public static void main(String[] args) {
		
		int n,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("it is prime number");
		}
		else 
		{
			System.out.println("it is not a prime number");
		}
		
	}
}
