package constructors;

public class MySingleton 
{
	static MySingleton instance=null;
	public int x= 10;
	private MySingleton()
	{
		System.out.println("Hello");
	}
	static public MySingleton getInstance()
	{
		if (instance == null)
			instance = new MySingleton();
		return instance;
	}
}
