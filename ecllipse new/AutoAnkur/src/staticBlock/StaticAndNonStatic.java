package staticBlock;

public class StaticAndNonStatic
{
	static int a = 100;
	static String name = "Ankur Malviya";
	static void disp()
	{
		System.out.println(a);
		System.out.println(name);
	}
	void funct()
	{
		System.out.println("beign of non static method");
		disp();
		System.out.println("ENd of non static method");
	}
	public static void main(String[] args) 
	{
		StaticAndNonStatic n = new StaticAndNonStatic();
		disp();
		
		n.funct();
		
		
	}

}
