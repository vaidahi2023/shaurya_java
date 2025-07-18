package shaurya_java;

import java.util.Scanner;

//Array is collection of elements that same datatype 
//1 2 3 4 5
//8 
// 1 2 3 8 4 5
//
// 1 2 3 4 5
// delete -- 2
//1 2 4 5
public class Array {

	public static void main(String[] args) {
		
		int pos=0,ele=0,size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the position:");
		pos=s.nextInt();
		for(int i=pos;i<size;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
