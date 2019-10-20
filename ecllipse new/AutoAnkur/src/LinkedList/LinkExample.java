package LinkedList;

import java.util.LinkedList;

public class LinkExample 
{

	public static void main(String[] args)
	{
		LinkedList <String>obj = new LinkedList<String>();
		obj.add("Malviya1");
		obj.add("Ankur");
		obj.add("Name");
		obj.add("Tiger");
		obj.add("Lion");
		obj.add("Bat");
		System.out.print(obj);
		System.out.println();
		
		obj.addFirst("First Element");
		obj.addLast("Last Element");
		System.out.print(obj);
		System.out.println();
		
		System.out.print(obj.get(2));
		
		System.out.println();
		
		obj.set(3, "Changed Value");
		System.out.print(obj);
		
		System.out.println();
		
		obj.remove(6);
		System.out.print(obj);
		
		System.out.println();
		
		System.out.print(obj.contains("Ankur")? "Yes" : "No");
		
		System.out.println();
		System.out.print(obj.pollLast());
		
	}

}
