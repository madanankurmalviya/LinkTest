package others;

public class SecondSmallestArray
{
	public static int getSecondSmallest(int[]a)
	{
		int temp;
		for(int x = 0 ;x < a.length ; x++)
		{
			for(int y=x+1 ; y<a.length ; y++)
			{
				if(a[x]>a[y])
				{
					temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		return a[1];
	}
	public static void main (String[]args)
	{
		int [] a = {10,3,5,5,2,0,2,8};
		int [] b = {4 , 8 ,1, 3, 10 };
		System.out.println("The second number in list is :"+getSecondSmallest(a));
		System.out.println("The second number in list is :"+getSecondSmallest(b));
	}
}
