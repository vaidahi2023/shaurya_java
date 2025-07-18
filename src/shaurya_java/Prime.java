package shaurya_java;

import java.util.Scanner;

/*
 * prime 
 * 5--1,5
 * 
 */
public class Prime {

	//with agrument with return
	int prime(int n)
	{
		int i,flag=0;
		for(i=2;i<n;i++)//12 
		{
			if(n%i==0) 
			{
				flag=1; 
				break;
			}
		}
		return flag;
		
	}
	public static void main(String[] args) {
		
		int num,flag;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		Prime p=new Prime();
		flag=p.prime(num);
		if(flag==0)
		{
			System.out.println("it is a prime number");
		}
		else 
		{
			System.out.println("it is not a prime number");
		}
	}
}
