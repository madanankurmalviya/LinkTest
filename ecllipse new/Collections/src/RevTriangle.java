
public class RevTriangle
{
	public static void main(String[]args)
	{
		int n=5;
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n-r-1;c++)
			{
				System.out.print(" ");
			}
			for(int d=n-r;d<=n;d++)
			{
				System.out.print(r+1);
			}
			System.out.println(" ");
		}
		
	}
}