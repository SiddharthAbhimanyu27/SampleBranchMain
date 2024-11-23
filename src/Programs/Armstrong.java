package Programs;

public class Armstrong 
{
	public static void main(String[] args)
	{
		int a=153;
		
		int b=a;
		
		int sum=0;
		
		while (a>0)
		{
			int c = a%10;
			
			sum = sum + (c*c*c);
			
			a=a/10;	
			
			System.out.println(sum);
			System.out.println("*************");
			
		}
		
		System.out.println(sum);
		
		if (sum==b)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}
		
	}
	

}
