package String;

public class SubsStringWithoutSubstring 
{
	public static void main(String[]args)
	{
		String str ="A12n34k888u444r123";
		String []st = str.split("");
		String a=" ";
		for(int i = str.length()-5; i<str.length(); i++)
		{
			String ab=st[i];
			a= a + ab;
		}
		System.out.println(a);
		}
}
