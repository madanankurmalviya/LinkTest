package constructors;

public class Test1 
{
	int x;
	private Test1(int x)
	{
		System.out.println("Running The Constructor");
		this.x=x;
	}
	public void disp()
	{
		System.out.println("Running the non static method");
	}
	public static Test1 getInstance(int x)
	{
		return new Test1(x);
	}
}
