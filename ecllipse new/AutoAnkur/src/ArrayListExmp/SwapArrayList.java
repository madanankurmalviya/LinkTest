package ArrayListExmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList <String> obj = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		for(String temp:obj)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		Collections.swap(obj, 1, 4);
		for(String temp:obj)
		{
			System.out.print(temp+" ");
		}
	}
}
