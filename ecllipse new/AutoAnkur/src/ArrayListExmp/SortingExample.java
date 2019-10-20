package ArrayListExmp;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample
{

	public static void main(String[] args) 
	{
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("B");
		obj.add("A");
		obj.add("Z");
		obj.add("C");
		obj.add("Y");
		System.out.println("Before Sorted");
		for(String a : obj)
		{
			System.out.print(a);
		}
		
		System.out.println();
		
		Collections.sort(obj);
		
		System.out.println("After Sorted");
		for(String a : obj)
		{
			System.out.print(a);
		}
		
		ArrayList <Integer> b = new ArrayList<Integer>();
		b.add(10);
		b.add(2);
		b.add(5);
		b.add(1);
		b.add(20);
		b.add(7);
		b.add(3);
		b.add(2);
		System.out.println();
		System.out.println("Before Sorting");
		for(int a : b)
		{
			System.out.print(a);
		}
		System.out.println( );
		Collections.sort(b);
		
		
		System.out.println("After sorting");
		for(int a: b)
		{
			System.out.print(a+" ");
		}
		
		

	}

}
