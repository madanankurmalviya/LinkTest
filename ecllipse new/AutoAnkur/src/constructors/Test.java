package constructors;

public class Test 
{
	int x;
	private static Test t ;
	private Test()
	{
		x=10;
		System.out.println("Running Constructor");
	}
	public static Test getInstance()
	{
		if(t==null)
		{
			t=new Test();
		}
		return t;
		
	}
}
