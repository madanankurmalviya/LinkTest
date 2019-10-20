package ArrayListExmp;

import java.util.ArrayList;

public class ArrayListExmpOne
{

	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList <String>();
		ArrayList<Integer>list=new ArrayList<Integer>();
		alist.add("Ankur");
		alist.add("Malviya");
		alist.add("Golu");
		
		System.out.println(alist);
		
		alist.add(1,"AnkurMalviya");
		System.out.println(alist);
		
		list.add(00);
		list.add(1);
		list.add(3);
				
		System.out.println(list);
		
		list.add(1,88);
		System.out.println(list);
		
		for(String a:alist)
		{
			System.out.print(a+"     ");
		}
		System.out.println();
		for(Integer b:list)
		{
			System.out.print(b+"     ");
		}
		System.out.println();
		int No = alist.size();
		System.out.println(No);
		boolean z = alist.contains("Ank");
		System.out.println(z);
		
		int pos = alist.indexOf("Malviya");
		System.out.println(pos);
		
		

	}

}
