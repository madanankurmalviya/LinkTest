package ArrayListExmp;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAllMethod {

	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("My");
		a.add("Name");
		a.add("Is");
		a.add("Ankur Malviya.");
		System.out.println("Here are the list without adding");
		for(String b : a)
		{
			System.out.print(b+" ");
		}
		ArrayList<String> z = new ArrayList <String>(Arrays.asList("I","am","your","Mentor","."));
		System.out.println();
		System.out.println("Here are the Second list without adding");
		for(String e:z)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		a.addAll(z);
		for(String t : a)
		System.out.print(t+" ");
		
	}
}
