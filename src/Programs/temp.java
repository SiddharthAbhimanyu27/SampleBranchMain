package Programs;

public class temp 
{
	public static void main(String[] args) 
	{
		int a=4;
		
		Fib(a);
		
	}
	
	static void Fib(int x)
	{
		int a=0;
		
		int b=1;
		
		System.out.println(a);
		
		System.out.println(b);
		
		for(int i=0;i<x-1;i++)
		{
			
			int sum=a+b;
			
			System.out.println(sum);
			
			a=b;
			
			b=sum;
			
			
		}
	}

}
