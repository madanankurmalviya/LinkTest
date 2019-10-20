package ArrayLIst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CopyArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Hello");
		l1.add("World");
//		System.out.println("before add : "+l1);
		
		ArrayList<String>l2=new ArrayList<>();
//		l2.add("This is Ankur");
		l2.add("Hello");
		l2.add("World");
//		System.out.println("Before Copy l2 is :"+l2);

		for(int a=0;a<l1.size();a++) 
		{ 	
				String ll = l2.get(a);
				String l = l1.get(a);
				System.out.println(l);
					if(ll.equals(l))
					{
						System.out.println("l1 is :"+l+ "  true  " + "And l2 is :"+ll);
					}
					else
					{
						System.out.print("l1 is :"+l+ "  False  " + "And l2 is :"+ll);
					}
		}
		

	}

}
