package StringExmp;

import java.util.HashMap;

public class occHashMap
{
	static void occCount(String str)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		char[] strArray = str.toCharArray();
		for(char a : strArray)
		{
			if(map.containsKey(a))
			{
				int val = map.get(a);
				map.put(a, val+1);
			}
			else
			{
				map.put(a, 1);
			}
		}
		System.out.println(map);
		
	}
	public static void main(String[] args) 
	{
		String str = "Ankkurr";
		occCount(str);
	}

}
