package shaurya_java;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int n,sum=0,cube=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		int temp=n;
		for(;n>0;)
		{
			cube=n%10;
			sum=sum+cube*cube*cube;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not a armstrong number");
		}
	}
}
