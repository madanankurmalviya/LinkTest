package Numbers;

public class FibonacciSeries
{
	public static void getSeries(int num1 , int num2)
	{
		for (int a = 0 ; a < 10 ; a++)
		{
			System.out.print( num1 +" + ");
			int sum = num1 + num2;
			num1 =  num2;
			num2 = sum;
		}
	}
	public static void main (String[]args)
	{
		int num1=0;
		int num2=1;
		getSeries(num1 , num2);
	}
	
	
}
