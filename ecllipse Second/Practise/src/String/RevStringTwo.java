package String;

public class RevStringTwo 
{
	public static void main (String []args)
	{
		String str = "Ankur";
		int len = str.length();
		System.out.println("The length of string is :"+len);
		String rev="";
		for(int a=len-1;a>=0;a--)
		{
			rev=rev+str.charAt(a);
		}
		System.out.print(rev);
	}
}
