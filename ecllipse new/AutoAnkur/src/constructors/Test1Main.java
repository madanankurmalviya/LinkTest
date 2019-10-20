package constructors;

public class Test1Main
{

	public static void main(String[] args) 
	{
		Test1 t1= Test1.getInstance(10);
		Test1 t2=Test1.getInstance(20);
		System.out.println("x = "+t1.x);
		t1.disp();
		System.out.println("x= "+t2.x);
		t2.disp();
	}

}
