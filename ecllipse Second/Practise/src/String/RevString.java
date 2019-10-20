package String;

import java.util.ArrayList;
import java.util.Collections;

public class RevString {

	public static void main(String[] args) 
	{
		String st = "Ab8********bbb    ###  // bbb88888***b        nfghj         ";
		st=st.replaceAll("[^a-zA-Z0-9]","");
		String rev="";
		int ln = st.length();
		for(int a=ln-1;a>=0;a--)
		{
			rev=rev+st.charAt(a);
		}
		System.out.print(rev);
		System.out.println();
		
	StringBuffer sbf = new StringBuffer("Hello My Name is Ankur.");
	System.out.print(sbf.reverse());
	
	System.out.println();
	String num="1 2 3 4 5 6 7 8 9 10";
	num=num.replaceAll("[^0-9]","");
	StringBuffer sbf1 = new StringBuffer(num);
	System.out.print(sbf1.reverse());
		
		
	}

}
