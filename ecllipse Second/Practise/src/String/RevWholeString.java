package String;

public class RevWholeString 
{
	public static void main(String[]args)
	{
		String str="Hello my name is ANkurMalviya";
		String[]st=str.split(" ");
		

		for(String s:st)
		{
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			System.out.print(sb+" ");
		} 
		System.out.println("");
		
		
	}
}
