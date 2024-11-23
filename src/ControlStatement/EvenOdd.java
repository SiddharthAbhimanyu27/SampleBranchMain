package ControlStatement;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args)
	{
		int a;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		a=s.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	
		
	}

}
