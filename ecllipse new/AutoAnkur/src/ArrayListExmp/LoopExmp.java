package ArrayListExmp;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopExmp 
{

	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ankur");
		obj.add("Malviya");
		obj.add("Golu");
		
		System.out.println("For Loop");
		for(int a= 0 ; a<obj.size(); a++)
		{
			System.out.println(obj.get(a));
		}
		System.out.println();
		System.out.println("Advanced For Loop");
		for(String a : obj)
		{
			System.out.print(a+" "+"\r");
		}
		
		System.out.println("WHile Loop");
		System.out.println();
		int a=0;
		while(obj.size()>a)
		{
			System.out.print(obj.get(a)+" * ");
			a++;
		}
		
		System.out.println();
		
		System.out.println("Integer");
		
		
		Iterator<String> it = obj.iterator();
		
		
		
		while(it.hasNext())
		{
		   System.out.print(it.next()+" - ");	
		}
		
	}

}
