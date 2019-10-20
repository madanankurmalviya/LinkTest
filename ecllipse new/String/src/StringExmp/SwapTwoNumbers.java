package StringExmp;

public class SwapTwoNumbers 
{

	public static void main(String[] args) 
	{
		int a = 11;
		int b = 22;
		a=a+b;
		System.out.println(a);
		b=a-b;
		a=a-b;
		System.out.println("new a is "+a);
		System.out.println("new b is "+b);
		
		System.out.print("***********************************");
		System.out.println();
		String aa ="Ankur";
		String bb = "Malviya";
		aa=aa+bb;
		System.out.println(aa);
		bb=aa.substring(0,aa.length()-bb.length());
		System.out.print(bb);
		System.out.println();
		aa=aa.substring(bb.length());
		System.out.print(aa);
	
	}

}
