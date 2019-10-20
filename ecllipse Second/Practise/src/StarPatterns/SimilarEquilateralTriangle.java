package StarPatterns;

public class SimilarEquilateralTriangle 
{

	public static void main(String[] args) 
	{
		for(int row = 1 ; row <= 6 ; row++)
		{
			for(int col = 1 ; col <= 6-row ; col ++)
			{
				System.out.print(" ");
			}
			int val=1;
			{
			for(int col=row; col >=1 ; col --)
			{
				System.out.print(val++);
			}
			for(int col=row-1; col >=1 ; col --)
			{
				val=val-col-1;
				System.out.print(val);
			}
			}
			System.out.println( );
				
		}

	}

}
