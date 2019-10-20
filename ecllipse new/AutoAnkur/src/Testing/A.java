package Testing;

public class A 
{
	int NUM;
	A(int b)
	{
		NUM=b;
		System.out.println("Here are the print from A");
	}
	public static void main (String[]args)
	{
		A an = new A(20);
		System.out.println(an.NUM);
	}
}
