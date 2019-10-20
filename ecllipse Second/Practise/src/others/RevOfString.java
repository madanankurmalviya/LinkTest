package others;

public class RevOfString 
{
	public static String getRev(String abs)
	{
		String[] s = abs.split("");
		String rev="";
		for(int a = s.length-1 ; a >= 0 ; a-- )
		{
			rev = rev + s[a];
		}
			return rev;
	}
	public static void main (String[]args)
	{
		String st = "AnkurMalviya";
		System.out.println("The reverse string is : "+getRev(st));
	}
}
