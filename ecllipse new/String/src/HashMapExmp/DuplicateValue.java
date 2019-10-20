package HashMapExmp;

import java.util.HashMap;
import java.util.Set;

public class DuplicateValue
{

	public static void main(String[] args)
	{
		String str = "ababac";
		HashMap<Character,Integer> map = new HashMap<>();
		for(char ch : str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				int val = map.get(ch);
				map.put(ch, val+1);
			}
			else
			{
				map.put(ch, 1);
			}
			System.out.println(map);
		}
	   Set <Character > key = map.keySet();
	   for(char a : key)
	   {
		   if(map.get(a)>1)
		   {
			   System.out.println("The character :"+a+" "+map.get(a)+" "+"times.");
		   }
	   }

	}
}
