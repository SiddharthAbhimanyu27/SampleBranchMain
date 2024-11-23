import java.util.Scanner;

public class Method
{
	public static void main(String[] args)
	{
	
		int a=add(3,4);
		System.out.println(a);
		
		Method m=new Method(); //To access non static method , we need to create obj 
		
		m.Mul(3, 4);
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter 3 number to find its product");
		int b,c,d;
		
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		
		m.Mul(b, c, d);
				
		
	}
	public static int add(int a , int b)
	{
		int c=a+b;
		return c;
	}
	public void Mul(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	public void Mul(int a,int b,int c)
	{
		int d=a*b*c;
		System.out.println(d);
	}

}
