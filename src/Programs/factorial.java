package Programs;

import java.util.Scanner;

public class factorial 
{
	public static void main(String[] args)
	{
		int a;
		
		int Fact = 1;
		
		System.out.println("Enrter the number to find fact");
		
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		
		while (a>0)
			
		{
			
			Fact = Fact*a;
			
			a--;
	
			
		}
		
		System.out.println(Fact);
		
	}

}
