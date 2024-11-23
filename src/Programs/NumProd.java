package Programs;

public class NumProd
{
	public static void main(String[] args) 
	{
		int a=456;
		
		int Mul=1;
		
		while(a>0)
		{
			int b = a%10;
			
			Mul=Mul*b;
			
			a=a/10;
		}
		
		System.out.println(Mul);
		
	}

}
