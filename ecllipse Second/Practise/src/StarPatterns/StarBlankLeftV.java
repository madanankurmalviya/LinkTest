package StarPatterns;

public class StarBlankLeftV
{
	public static void main (String[]args)
	{
		for(int row = 1 ; row <=5 ; row ++)
		{
			for (int col = 1 ; col <=row ; col++)
			{
				if(row==col)
				{
					System.out.println("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		for(int row=4; row>=1;row--)
		{
			for(int col=1;col<=row; col++)
			
			{
				if(col==row)
				{
					System.out.println("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
	}
}
