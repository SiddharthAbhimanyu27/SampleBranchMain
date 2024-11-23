package ControlStatement;

import java.util.Scanner;

public class Switch_Method
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number to perform the Function \n 1=add \n 2=mul \n 3=sq");
		
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		
		Switch_Method m1=new Switch_Method();
		
		switch (a)
{
		case 1: 
		{
			System.out.println("Enter the value of 1st number ");
			
			int b=s.nextInt();
			
			System.out.println("Enter the value of 2nd number ");
			
			int c= s.nextInt();
			
		m1.add(b, c);
		}
		break;
		
		case 2:
		{
			System.out.println("Enter the value of b");
			
			int b=s.nextInt();
			
			System.out.println("Enter the value of c");
			
			int c= s.nextInt();
			
			Switch_Method.mul(b, c);
		}
		break;
		
		
		case 3:
		{
             System.out.println("Enter the value of number to be find its square");
			
			int b=s.nextInt();
			
			int d = Switch_Method.square(b);
			
			System.out.println(d);
		}
		break;
}
		
		
	}
	
	static void mul(int a , int b)
	{
		int c = a*b;
		System.out.println(c);
	}
	
	void add(int a , int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	static int square(int a)
	{
		int b = a*a;
		return b;
	}

	Switch_Method()
	{
		System.out.println("Welcome to Programming");
	}
	

}
