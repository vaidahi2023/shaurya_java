package shaurya_java;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		
//		int a[][]=new int[3][3];
//		int b[][]=new int[3][3];
//		int sum[][]=new int[3][3];
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the elements of a:");
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				a[i][j]=s.nextInt();
//			}
//		}
//		System.out.println("Enter the elements of b:");
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				b[i][j]=s.nextInt();
//			}
//		}
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				sum[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.print("\n");
//		}
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.print("\n");
//		}
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(sum[i][j]+" ");
//			}
//			System.out.print("\n");
//		}
		
		int sum=0;
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements of a:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the elements of b:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum=0;
				for(int k=0;k<3;k++)
				{
					sum=sum+a[i][k]*b[j][k];
				}
				c[i][j]=sum;
			}
		}
		
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.print("\n");
	     }
		
	}
}