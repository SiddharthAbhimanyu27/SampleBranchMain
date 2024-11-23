
public class MethodOvl 
{
	public static void main(String[] args) 
	{
		add(7, 3, 4);
		
		add(3, 4);
		
		add(7, 7.7);
		
	}
	
	public static void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
		
	}
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}

}
