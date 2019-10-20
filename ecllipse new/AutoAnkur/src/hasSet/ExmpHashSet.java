package hasSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ExmpHashSet {

	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		System.out.println(h.size());
		h.add("A");
		h.add("B");
		h.add("C");
		h.add(1);
		h.add(null);
		System.out.println(h.size());
		for(Object a : h)
		{
			System.out.println(h);
		}
		//h.add("A")
		System.out.println(h.size());
		for(Object a : h)
		{
			System.out.println(h);
		}
		LinkedHashSet lh = new LinkedHashSet();
		System.out.println(h.size());
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add(1);
		lh.add(null);
		System.out.println(lh.size());
		for(Object a : lh)
		{
			System.out.println(lh);
		}
		//lh.add("A")
				/*System.out.println(lh.size());
				for(Object a : lh)
				{
					System.out.println(lh);
				}*/
		
	}

}
