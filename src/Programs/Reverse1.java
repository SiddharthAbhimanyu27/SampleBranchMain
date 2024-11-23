package Programs;

public class Reverse1 
{
	public static void main(String[] args)
	{
		int a=741;
		
		while (a>0)
		{
			int b = a%10;
			
			String c= b+"";
			
			 a = a/10;
			 
			 System.out.print(c);
		}
			
	}

}
 