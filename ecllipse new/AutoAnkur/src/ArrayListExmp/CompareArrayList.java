package ArrayListExmp;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayList
{
	public static void main(String[] args) 
	{
		ArrayList <String> a = new ArrayList<String>(Arrays.asList("A","B","D","E","A","Z"));
		ArrayList<String> b =new ArrayList<String>(Arrays.asList("Z","X","W","A","A","B"));
		for(String d: a)
		{
			System.out.print(d);
		}
		System.out.println();
		for(String d:b)
		{
			System.out.print(d);
		}
		ArrayList <String> x = new ArrayList<String>();
		for(String temp:a)
		{
			x.add(b.contains(temp)? "Yes":"No");
			System.out.println(x);
		}
	}

}