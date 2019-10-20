package StringExmp;

import java.util.HashMap;
import java.util.Set;

public class HashMapCountSecond 
{
	static String str = "ProgrammiPggdjckjdckjsdncksdnckng";
	public static void main(String[] args) 
	{
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) 
		{
			if (map.containsKey(ch))
			{
				int val = map.get(ch);
				map.put(ch, val + 1);
				
			} 
			else 
			{
				map.put(ch, 1);
			}
		}
		Set<Character> keys = map.keySet();  
        for (Character ch : keys) 
        {  
            if (map.get(ch) > 1)
            {  
                System.out.println(ch + "  is " + map.get(ch) + " times");  
            } 
		        }
	}
}