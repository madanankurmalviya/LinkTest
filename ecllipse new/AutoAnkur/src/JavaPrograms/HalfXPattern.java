package JavaPrograms;

public class HalfXPattern 
{

	public static void main(String[] args)
	{
		for(int r = 0;r<7;r++)
		{
			for(int c=3;c<7;c++)
			{
				if(r==c||r+c==7-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
