package JavaPrograms;

public class BubbleSortTwo 
{

	public static void main(String[] args) 
	{
		int [] a={200,100,2,58,5};
		int b=0,e=0;
		for(int r = 0; r<a.length; r++)
		{
			int flag = 0;
			for(int c = 0; c<a.length-1;c++)
			{
				
				if(a[c]>a[c+1])
				{
					int temp=a[c];
					a[c]=a[c+1];
					a[c+1]=temp;
					flag=1;
					b++;
					System.out.println("Here is the comparisons= "+b);
				}
//				if(flag==0)
//				{
//					break;
//				}
			}
			
			e=e+1;
			System.out.println("Here are the number of rounds = "+e);
			
			System.out.println();
		}
		for(int r=0;r<a.length;r++)
		{
			System.out.print(a[r]+" ");
		}
		
	}

}
