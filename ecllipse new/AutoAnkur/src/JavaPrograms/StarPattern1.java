package JavaPrograms;

public class StarPattern1 
{

	public static void main(String[] args) 
	{
		for(int r=1;r<=10;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=10;c++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
