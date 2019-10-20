package StringExmp;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Occ {

	public static void main(String[] args)
	{
		String str = "Abhshsa1222211111sakkjahkajsajhkjahkjajbhdylurweg2222115554528521552454121dvghtgfdcvbhjygtfdcvbhjuytfdcvbhj";
		int b=0;
		HashMap<Character,Integer> list = new HashMap<>();
		for(char ch : str.toCharArray())
		{
			if(list.containsKey(ch))
			{
				b+=1;
				list.put(ch, b);
				System.out.println("1st "+list.get(ch));
				
			}
			else
			{
				list.put(ch, 1);
				//System.out.println("2nd "+list);
			}
		}
		//System.out.println("3rd "+list);
				
		
	}

}
