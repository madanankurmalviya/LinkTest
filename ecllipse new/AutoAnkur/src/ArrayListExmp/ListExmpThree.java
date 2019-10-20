package ArrayListExmp;

import java.util.ArrayList;

public class ListExmpThree {

	public static void main (String[]args)
	{
		ArrayList <String> a = new ArrayList<String>();
		ArrayList <Integer>b= new ArrayList<Integer>();
		a.add("Ank");
		b.add(1);
		a.add("mal");
		b.add(2);
		System.out.print(a+" "+b+"\r");
		for(String z:a)
		{
			System.out.print(z+"\r");
		}
	
		for(int y:b)
		{
			System.out.print(y);
		}
	}
}
