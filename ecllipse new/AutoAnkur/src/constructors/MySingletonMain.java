package constructors;

public class MySingletonMain
{

	public static void main(String[] args) 
	{
		MySingleton a = MySingleton.getInstance();
		MySingleton b = MySingleton.getInstance();
		a.x=a.x+10;
		System.out.println("Here the value = "+a.x);
		System.out.println("Here the value = "+b.x);
	}

}
