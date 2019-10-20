package Numbers;

import java.util.ArrayList;
import java.util.Collections;

public class Palindrome
{

	public static void main(String[] args) 
	{
		String str = "AnkurMalviya";
		String [] s = str.split("");
		String rev="";
		ArrayList<String> list = new ArrayList<>();
		for(String as : s)
		{
			list.add(as);
			rev = rev + as;
		}
		System.out.println(list);
		//Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("The value is :"+rev);
		
	}

}
