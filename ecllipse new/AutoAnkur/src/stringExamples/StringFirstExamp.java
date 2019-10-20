package stringExamples;
public class StringFirstExamp 
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer();
		s.append(true);
		s.append(1);
		s.append("Ankur");
		s.trimToSize();
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(s.charAt(1));
		s.reverse();
		System.out.println(s);
		System.out.println(s.indexOf("A"));
	}
}
