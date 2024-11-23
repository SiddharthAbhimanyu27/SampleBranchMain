package Programs;

public class Downcasting 
{
	public static void main(String[] args)
	{
		Wild ani= new Tiger (); //Down casting
		
		Tiger cat=  (Tiger) ani; // up casting
		
		Pomerian pom=(Tiger)ani;  // up casting
		
		ani.Sound();
		
		ani.type();
		
		System.out.println("***************");
		
		cat.Sound();
		
		cat.type();
		
		cat.tiger();
		
		cat.sample();
		
		System.out.println("***********");
		
		pom.Sound();
		
		pom.type();
		
		pom.sample();
		
		
	}
	
}

class Wild 
{
	void Sound()
	{
		System.out.println("sound");
	}
	
	void type()
	{
		System.out.println("animal");
	}
}
class Pomerian extends Wild
{
	void Sound() 
	{
		System.out.println("bark");
	}
	
	void sample()
	{
		System.out.println("samp");
	}
}

class Tiger extends Pomerian
{
	void Sound()
	{
		System.out.println("meow");
	}
	static void tiger()
	{
		System.out.println("Tiger");
	}
}