package shaurya_java;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		int n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		for(;n>0;)
		{
			count++;
			n=n/10;
		}
		System.out.println("no of digit is "+count);
	}
}
