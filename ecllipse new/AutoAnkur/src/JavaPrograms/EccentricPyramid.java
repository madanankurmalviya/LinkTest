package JavaPrograms;

public class EccentricPyramid
{

	public static void main(String[] args) 
	{
		int a = 5;
		for(int b=a ; b>=1;b--)
		{
			for(int space =1;space <=a-b;space++)
			{
				System.out.print("# ");
			}
			for(int e=1;e<=2*b-1;e++)
			{
				System.out.print("*  ");
			}
//			for(int f=0;f<b-1;f++)
//			{
//				System.out.print("$ ");
//			}
			System.out.println( );
		}

	}

}
