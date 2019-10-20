package constructors;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Test t1= Test.getInstance();
		Test t2= Test.getInstance();
		System.out.println("x= "+t1.x);
		System.out.println("x= "+t2.x);
		
		t2.x=1000;
		System.out.println("x2= "+t1.x);
		System.out.println("x2= "+t2.x);
		
	}
}
