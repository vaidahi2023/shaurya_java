package shaurya_java;

import java.util.Scanner;

//  123 --321 
//123
//12
//1
//121  -- 121  --palindrome number
//123 --321 --not palindrome number 
public class Reverse {

	public static void main(String[] args) {
		
		int n,rem=0,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		for(;n>0;)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse number="+rev);
	}
}
