package JavaPrograms;

public class NumDecrement 
{

	public static void main(String[] args) 
	{
		int row=10;
		int w=1;
		for(int a = row ; a >=1 ; a--)
		{
			for(int b=1;b<=a ; b++)
			{
				System.out.print(w+" ");
			}	
			w++;
			System.out.println( );
		}
	}

}
