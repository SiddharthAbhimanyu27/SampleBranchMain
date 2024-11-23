package Programs;

public class Hallow_Sq 
{
	public static void main(String[] args)
	{
		for(int i=0;i<7;i++)
			
		{
			for(int j=0;j<7;j++)
				
			{
				if(i==0||i==6||j==0||j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

				
				/*if(j==0||j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}*/
				
				/*The way conditions are structured means that if both conditions for rows and columns are met,
				an asterisk is printed twice in the corners (for example, the top-left corner). The intended logic
				should unify these checks to ensure an asterisk is printed only once for each border position.*/
				
			}
			
			System.out.println();
		}
			
			
		
	}

}
