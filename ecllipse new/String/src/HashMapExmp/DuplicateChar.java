package HashMapExmp;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class DuplicateChar
{

	public static void main(String[] args) 
	{
		//String str = "ababac";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your desired name: ");
		
		String str = sc.nextLine();
		System.out.println("The entered value is : "+str);
		
		HashMap <Character , Integer > map = new HashMap <> ();
		
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
		}
		Set <Character> key = map.keySet();
		for(char a : key)
		{
			if(map.get(a)>1)
			{
				System.out.println(a+" "+map.get(a));
			}
		}
	}

}
