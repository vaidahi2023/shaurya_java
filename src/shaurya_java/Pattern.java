package shaurya_java;

public class Pattern {

	
	public static void main(String[] args) {
		//i=row j=column
//		for(int i=0;i<2;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
//
//*****
//*****
//*****
//*****
//*****


//*
//**
//***
//****
//*****
//****
//***
//**
//*


//		*
//	   * *
//	  * * *
//	 * * * *
//  * * * * *











