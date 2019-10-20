package others;

import java.util.Arrays;

public class SecondSmalNum
{
	public static int getSecondSmallestNum(int [] arr)
	{
		int temp;
		for (int i=0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if(arr[i]>arr[j])
				{
					temp= arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
		
	}
	public static void main(String[]args)
	{
		int[] a = {2,0,1,5,3,2,10};
		System.out.println(getSecondSmallestNum(a));
		
	}
}
