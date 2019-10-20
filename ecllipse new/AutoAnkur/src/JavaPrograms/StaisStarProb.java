package JavaPrograms;

import java.util.Scanner;

public class StaisStarProb 
{
	
	static void star(int size)
	{
		int k=1;
		for(int r=0;r<size;r++)
		{
			for(int c=0;c<k;c++)
			{
				System.out.print("* ");
			}
			k=k+2;
			System.out.println();
		}
		System.out.println("Here are the vlaue to solve= "+k);

	}
	public static void main(String[] args)
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the vlaue= ");
		int size = sc.nextInt();
		//StaisStarProb a= new StaisStarProb();
		star(size);
	}

}
