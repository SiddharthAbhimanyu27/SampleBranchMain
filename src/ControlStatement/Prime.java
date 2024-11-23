package ControlStatement;

public class Prime 
{
	public static void main(String[] args) 
	{
		prime(11);
	
	}
	
	static void prime(int a)
	{
		int count=0;
		
		for (int i=1; i<a; i++)
		{
			if (a%i==0)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("not Prime");
		}
		else 
		{
			System.out.println("Prime");
		}
		
	}

}
