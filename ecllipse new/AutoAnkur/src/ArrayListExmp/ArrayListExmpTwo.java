package ArrayListExmp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExmpTwo {
	
	public static void main(String[]args)
	{
		ArrayList <String> b = new ArrayList <String>(Arrays.asList("Hello","Dear","Friends"));
		System.out.print(b+" ");
		for(String a:b)
		{
			System.out.print(a+" ");
		}
				
	}

}
