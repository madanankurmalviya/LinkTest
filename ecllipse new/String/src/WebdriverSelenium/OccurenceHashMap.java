package WebdriverSelenium;

import java.util.HashMap;

public class OccurenceHashMap 
{
	public static void main(String[] args)
	{
		String str ="hELLO eVERYONE";
		HashMap<Character, Integer> list = new HashMap<>();
		System.out.println(str);
		System.out.println(list);
		for(char ch : str.toCharArray())
			
		{
			System.out.println(list);
			if(list.containsKey(ch))
				{
					int val = list.get(ch);
					list.put(ch, val+1);
				}
			else
				{
					list.put(ch, 1);
				}
			
		}
		System.out.println(list);
	}

}
