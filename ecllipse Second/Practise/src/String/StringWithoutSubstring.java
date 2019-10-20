package String;

import java.util.Scanner;

public class StringWithoutSubstring 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired string:  ");
		String s= sc.nextLine();
		//String str = "MalyalamScript";
		String str = s;
		int len=str.length();
		
		//convert into array
		
		String [] st =str.split("");
		int withoutLength =len-7;
		
		//Define st1 null
		
		String st1="";
		
		for(int a=0;a<len;a++)
		{
			if(a>=withoutLength)
			{
				st1=st1+st[a];
			}
		}
		System.out.println(st1);
	}
}










