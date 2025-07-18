package shaurya_java;

import java.util.Scanner;

public class MaximumArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		int max;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<5;i++)
		{
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("maximum value is "+max);
	}
}

//1 2 3 4 5
//2 4 
