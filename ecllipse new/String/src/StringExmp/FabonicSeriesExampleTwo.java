package StringExmp;

import java.util.Scanner;

public class FabonicSeriesExampleTwo 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c ;
		System.out.print(+a+" "+b);
		
		
		
		for(int x=2;x<10;x++)
		{
			c=a+b;
			System.out.print(" "+c);
		
			a=b;
			b=c;
			
			
			
			
		}
		
		

	}

}
