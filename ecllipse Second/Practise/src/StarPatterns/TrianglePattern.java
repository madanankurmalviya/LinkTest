package StarPatterns;

public class TrianglePattern
{

	public static void main(String[] args) 
	{
		
		for(int row = 0 ; row < 10 ; row ++)
		{
			int a=1;
			for(int col = 0 ; col < 10-row ; col++)
			{
						
				System.out.print(a+++" ");
			}
			System.out.println();
		}

	}

}
