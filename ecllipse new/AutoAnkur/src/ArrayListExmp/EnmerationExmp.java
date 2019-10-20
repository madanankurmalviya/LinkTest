package ArrayListExmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnmerationExmp {

	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<String>(); 
		obj.add("Ankur");
		obj.add("Malviya");
		obj.add("Golu");
		
		Enumeration<String> e = Collections.enumeration(obj);
		
		System.out.println("Elements are: ");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		 
	}

}
