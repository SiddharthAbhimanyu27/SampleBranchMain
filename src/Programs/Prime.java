package Programs;

public class Prime
{
	public static void main(String[] args) 
	{
		int a=13;				;
		
		int count =0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
			
		}
		
		if(count>0)
		{
			System.out.println("Not a Prime");
		}
		else
		{
			System.out.println("Prime");
		}
			
		
		
		
	}

}
