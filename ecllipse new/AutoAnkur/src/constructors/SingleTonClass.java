package constructors;

public class SingleTonClass
{
	private static SingleTonClass obj = null;
	
	private SingleTonClass()
	{
		int x=10;
	}
	public static SingleTonClass object()
	{
		if(obj==null)
		{
			
			obj = new SingleTonClass();
		}
		return obj;
	}
	public void display()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		SingleTonClass myObj = SingleTonClass.object();
		myObj.display();
		
	}

}
