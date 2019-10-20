package JavaPrograms;

import java.util.Scanner;

public class Xstar 
{
	
	void patterMethod(int size,String display)
	{
		for(int r=0;r<size;r++)
		{
			for(int c=0;c<size;c++)
			{
				if(r==c||r+c==size-1)
				{
					System.out.print(display);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter you size");
		int size=sc.nextInt();
		sc.nextLine();
		System.out.println("ENter you Display");
		String display=sc.nextLine();
		
		Xstar a = new Xstar();
		
		a.patterMethod(size,display);
		

	}

}
