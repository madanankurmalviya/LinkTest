package ArrayListExmp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCompExmp {

	public static void main(String[]args)
	{
		ArrayList<String>a=new ArrayList<String>(Arrays.asList("A","B","C"));
		ArrayList<String>b=new ArrayList<String>(){{add("AB");add("BC");add("CDEFGH");}};
		System.out.print(a+" "+b);
	}
}
