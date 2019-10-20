package staticBlock;

public class StaticBLocks
{
	static int num;
	static String name;
	static void b1()
	{
		System.out.println("Here is the first line");
		num=100;
		name="Ankur Malviya";
	}
	static void b2()
	{
		System.out.println("Here is the second line");
		num=200;
		name="James Bond";
	}
	static void b3()
	{
		System.out.println("Here is the third line");
		num=300;
		name="Steve M";
	}
	public static void main(String[] args) 
	{

		b2();
		System.out.println(num);
		System.out.println(name);
		
		b1();
		System.out.println(num);
		System.out.println(name);
		
		b3();
		System.out.println(num);
		System.out.println(name);
	}

}
