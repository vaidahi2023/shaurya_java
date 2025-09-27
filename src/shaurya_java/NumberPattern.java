package shaurya_java;

/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

public class NumberPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
			
		}
	}
}

//A
//AB
//ABC
//ABCD
//ABCDE

//ABCDE
