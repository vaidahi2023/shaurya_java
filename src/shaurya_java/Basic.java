package shaurya_java;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		//nextint method id used to scan the value from user		
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		System.out.println("sum="+sum);
		
	}
}
