package staticBlock;

public class StaticExmp 
{
	static int num;
	static String myStr;
	static 
	{
		num=100;
		myStr="Ankur Malviya";
	}
	public static void main(String[] args) 
	{
		System.out.println(num);
		System.out.println(myStr);
	}
}
