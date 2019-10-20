package ArrayLIst;

import java.util.Arrays;
public class CompareTwoArrays 
{
	public static void main(String[]args)
	{
		int [] a1 = {1,2,3};
		int [] a2 = {1,2,3};
		Object [] ar1= {a1};
		Object [] ar2 = {a2};
		if(Arrays.deepEquals(ar1,ar2))
		{
			System.out.println("Both are equals");               
		}
		else
		{
			System.out.println("Both are NOT equals");        
		}
	}
}
