package finalClass;

public class FinalConstructor 
{
	final int ROLLNO;
	FinalConstructor(int a)
	{
		ROLLNO=a;
	}
	void myMethod()
	{
		System.out.println("Here are the first method value = "+ROLLNO);
	}
	void myMethod2()
	{
		System.out.println("Here are the second method value = "+ROLLNO);
	}
	public static void main(String[] args) 
	{
		FinalConstructor b = new FinalConstructor(100);
		b.myMethod();
		FinalConstructor z = new FinalConstructor(200);
		z.myMethod2();
	}

}
