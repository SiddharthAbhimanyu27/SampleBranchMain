package Programs;

public class upcasting
{
	public static void main(String[] args)
	{
		Animal cat=new Cat();
		
		Animal dog=new Dog();
		
		cat.sound(); //cat.type (not able to access this method 
		
		dog.sound();
		
		cat.Exclusive();
		
		dog.Exclusive();
		
	}
	
	
}

class Animal
{
	void sound()
	{
		System.out.println("mskes sound");
	}
	
	void Exclusive()
	{
		System.out.println(" This is Exclusive to this method");
	}
}

class Cat extends Animal
{
	void sound()
	{
		System.out.println("meow");
	}
	void type()
	{
		System.out.println("Tiger");
	}
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("Bark");
	}
}
