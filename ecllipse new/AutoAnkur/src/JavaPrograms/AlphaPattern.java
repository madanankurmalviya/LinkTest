package JavaPrograms;

public class AlphaPattern 
{

	public static void main(String[] args)
	{
		char last='Z', Alpha='A';
		for(int a =1; a<=(last-'A'+1);a++)
		{
			for(int t=1;t<=a;t++)
			{
				System.out.print(Alpha+ " ");
			}
			Alpha++;
			System.out.println( );
		}

	}

}
