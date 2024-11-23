package Programs;

public class Total_Prime
{
	static int count=0;
	
	public static void main(String[] args)
	{
		int a=20;
		
		for(int i=2;i<=a;i++)
		{
			Prime(i);
		}
		
		System.out.println(count);
	}
	
	static void Prime(int a)
	{
		int b=0;
		
		for(int i=1;i<=a;i++)
		{
			
			if(a%i==0)
			{
				b++;
			}
		}
		
		if(b<=2)
		{
			System.out.println(a);
			
			count++;
		}
	}

}
