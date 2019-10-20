package LinkedList;

import java.util.LinkedList;

public class LinkedAddAll
{
	public static void main(String[] args) 
	{
		LinkedList <String> obj = new LinkedList<String>();
		obj.add("Ankur");
		obj.add("Malviya");
		obj.add("Name");
		System.out.print(obj);
		System.out.println();
		
		LinkedList <Integer> obj1 = new LinkedList<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(8);
		System.out.print(obj1);
		System.out.println();
		
		LinkedList <String> obj2 = new LinkedList<String>();
		obj2.add("Go");
		obj2.add("Man");
		obj2.add("Hello");
		System.out.print(obj2);
		System.out.println();
		obj.addAll(obj2);
		System.out.print(obj);
	}
}
