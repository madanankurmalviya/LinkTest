package JavaPrograms;

public class SymmetricalPyramid 
{

	public static void main(String[] args)
	{
		int a,b,k;
		a=b=k=0;
		for(int r=1;r<=10;r++)
		{
			for(int c=1;c<=10-r;c++)
			{
				System.out.print(" ");
				
				a++;
			}
			while(k!=2*r-1)
			{
				if(a<=r-1)
				{
					System.out.print((r+k)+" ");
					a++;
				}
				else
				{
					b++;
					System.out.print((r+k-2*b)+" ");
				}
				k++;
				a=b=k=0;
				System.out.println( );
			}
		}
	}

}
