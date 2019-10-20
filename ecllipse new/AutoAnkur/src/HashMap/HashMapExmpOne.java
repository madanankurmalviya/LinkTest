package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapExmpOne {

	public static void main(String[] args)
	{
		HashMap h = new HashMap();
		h.put(1, "Ank");
		h.put(2, "Mal");
		h.put(3, "Prabha");
		h.put("Boss", "Prabha Malviya");
		h.put(null, "Amazon");
		h.put("Google", null);
		
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		Iterator itr = h.entrySet().iterator();
		
		while (itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry mp =(Map.Entry) itr.next();
			System.out.println(mp.getKey()+"-------"+mp.getValue());
		}
		
		

	}

}
