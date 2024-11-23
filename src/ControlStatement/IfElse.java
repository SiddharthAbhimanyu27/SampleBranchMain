package ControlStatement;

import java.util.Scanner;

public class IfElse
{
	public static void main(String[] args) 
	{
	  Scanner s=new Scanner(System.in);
	  
	  System.out.println("Enter your age for voting Eligibility");
	  
	  int age;
	  
	  int EA=18;
	  
	  age=s.nextInt();
	  
	  if(age>=EA)
	  {
		  System.out.println("You're Eligible to Vote");
		 
	  }
	  else
	  {
		  System.out.println("Not Eligible to Vote");
	  }
		
	}

}
