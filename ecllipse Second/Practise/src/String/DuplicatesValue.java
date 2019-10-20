package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesValue {

	public static void main(String[] args) {
//		String str = "Java python java ruby java selenium";
//		char[] strArray = str.toCharArray();
//		System.out.println(strArray);
		
		String[] str = {"Java","python", "java",  "ruby" ,"java" ,"selenium"};
		
		Set <String> list = new HashSet<String>();
		for(String a:str)
		{
			if(list.add(a)==false)
			{
				System.out.print("Duplicate value is : "+a);
			}
		}
		
		
		// 2. HashMap
		
		HashMap<String, Integer> map = new HashMap<>();
		for(String b : str)
		{
			Integer value = map.get(b);
			if(value==null)
			{
				map.put(b,1);
			}
			else
			{
				map.put(b, value+1);
			}
		}
		System.out.println(map);
		Set<String> keys = map.keySet();
		for(String bb:keys)
		{
			if(map.get(bb)>1)
			{
				System.out.println(bb+ " " +map.get(bb));
			}
		}
		
		// 3. for loop
		
		for(int a= 0 ; a<str.length;a++)
		{
			for(int b=a+1;b<str.length;b++)
			{
				if(str[a].equals(str[b]))
				{
					System.out.println(str[a]+" "+a);
				}
				
			}
		}
		
		
		

	}

}
