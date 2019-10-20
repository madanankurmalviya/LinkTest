package StringExmp;

public class RecursiveFibonacciSeries 
{
	static int a=0 , b=1 , c=0;
	static void printS(int count)
	{
		if(count>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" " +c);
			//System.out.println("The count is : "+count);
			printS(count-1);
		}
	}

	public static void main(String[] args)
	{
		int count = 10;
		System.out.print(+a+" "+b);
		printS(count-2);
	}
}
