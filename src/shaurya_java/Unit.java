package shaurya_java;

import java.util.Scanner;

/*
 * Write a java program to input electricity unit charge and calculate the total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.

example :120 unit
120-50 = 70
=50*0.50+70*0.75
=25+52.5
=77.5

bill = 77.5*0.2+77.5
	 =93
	 
50*0.50=25
 */
public class Unit {

	public static void main(String  args[])
	{
		int unit;
		double total;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the units:");
		unit=s.nextInt();
		if(unit<=50)
		{
			total=unit*0.50;
		}
		else if(unit<=150)
		{
			total=((unit-50)*0.75)+25;
		}
		else if(unit<=250)
		{
			total=(unit-150)*1.20+25+75;
		}
		else 
		{
			total=(unit-250)*1.50+25+75+120;
		}
		
		total=total*0.20+total;
		System.out.println("total bill ="+total);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
