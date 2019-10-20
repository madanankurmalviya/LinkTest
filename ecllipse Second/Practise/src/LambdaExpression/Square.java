package LambdaExpression;

interface A
{
	public int square(int n);
}
public class Square
{
	public static void main(String[]args)
	{
		A a = n -> n*n;
		System.out.println("The first sq: "+a.square(5));
		System.out.println("The Second sq: "+a.square(6));
		System.out.println("The third sq: "+a.square(7));
	}

}
