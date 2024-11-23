package Programs;

public class Fibbonacci
{
	
	public static void main(String[] args)
	{
		int fib=4;
		
		Fib(fib);
		
	}
	
	static void Fib(int x)
	{
		 int a=0;
		
		 int b=1;
		 
		 int sum=0;
		
        System.out.println(a);
		
	    System.out.println(b);
	    
	    for(int i=0;i<x-1;i++)
	    {
	    
	    sum=a+b;
	    
	    System.out.println(sum);
	    
	    a=b;
	    
	    b=sum;
	    
	    
	    }
	
	}

}
