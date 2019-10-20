package Numbers;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int a = 11 ,b=22;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" The new a is: "+a +" "+ "The new b is : "+b);
		
		String y= "Ankur";
		String z= "Malviya";
		y=y+z;
		z=y.substring(0, y.length()-z.length());
		y=y.substring(z.length());
		System.out.println("The new value of z is : "+z + " "+"The new value of y is : "+y);

	}

}
