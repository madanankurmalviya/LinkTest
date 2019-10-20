package ArrayListExmp;

import java.util.ArrayList;
import java.util.Collections;

public class SortedExmp2 {

	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Z");
		obj.add("B");
		obj.add("A");
		
		System.out.println(obj);
		for(String count : obj)
		{
			System.out.print(count+" ");
		}
		System.out.println();
		Collections.sort(obj);
		for(String count : obj)
		{
			System.out.print(count+" ");
		}
	}

}
