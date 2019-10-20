package ArrayListExmp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.poi.util.SystemOutLogger;

public class RevSorting 
{

	public static void main(String[] args)
	{
		ArrayList <String> obj = new ArrayList<String>(){{add("AA");add("ZZ");add("BB");add("TT");add("CC");}};
		System.out.println("Before SOrted");
		for(String a : obj)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		Collections.sort(obj);
		System.out.println("After sorted");
		for(String a: obj)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		Collections.reverse(obj);
		System.out.println("After Sorted Reverse");
		for(String a : obj)
		{
			System.out.print(a+" ");
		}
		obj.remove(1);
		obj.remove("ZZ");
		obj.set(1,"OM");
		obj.add("Madan Lal Malviya");
		System.out.print(obj);

	}

}
