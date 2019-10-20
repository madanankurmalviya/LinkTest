package StringExmp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorted {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Ankur");
		list.add("Z");
		list.add("Z");
		list.add("Boy");
		list.add("0");
		list.add("2");
		list.add("0");
		list.add("2");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		for(String a : list)
		{
			System.out.print(a);
		}
		
		Collections.reverse(list);
		System.out.println(list);

	}

}
