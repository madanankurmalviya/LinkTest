import java.util.ArrayList;
import java.util.Collections;

public class SortingExmp
{

	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Mal");
		obj.add("X");
		obj.add("b");
		obj.add("Ank");
		obj.add("z");
		System.out.println(obj);
		Collections.sort(obj);
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
		Collections.swap(obj, 1, 2);
		System.out.println(obj);
	}

}
