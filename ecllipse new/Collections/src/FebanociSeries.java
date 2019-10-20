import java.util.Scanner;

public class FebanociSeries
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter you expected Febonic Number");
		int count = in.nextInt();
		int n1=0,n2=1,n3;
		System.out.println(n1+"  ****  "+n2);
		
		for(int i =2;i<=count;i++)
		{
			n3=n1+n2;
			System.out.println(" Here are the febonaci series: "+n3);
			n1=n2;
			n2=n3;
			System.out.println("The value of a is : "+n1  +"  The vlaue of b is :  "+n2);
		}

	}

}
