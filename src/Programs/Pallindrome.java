package Programs;

public class Pallindrome 
{
	public static void main(String[] args) 
	{
		int a=123;
		
		int temp=a;
		
		int New=0;
		
		while(a>0)
		{
			int c=a%10;
			
			New = New*10+c;
			
			a=a/10;
			
		}
		
		if(New==temp)
		{
			System.out.println("pallindrome");
		}
		else
			System.out.println("Not a Pallindrome");
		
	}

}
