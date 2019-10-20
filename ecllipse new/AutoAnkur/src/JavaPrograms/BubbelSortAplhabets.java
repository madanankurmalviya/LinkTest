package JavaPrograms;

public class BubbelSortAplhabets
{

	public static void main(String[] args)
	{
		String[] a= {"B","A","D","C","Z","Y"};
		int flag=0;
		for(int r = 0; r <a.length;r++)
		{
			for(int c = 0;c <a.length-1;c++)
			{
				if(a[c].compareTo(a[c+1])<0)
				{
					String temp=a[c];
					a[c]=a[c+1];
					a[c+1]=temp;
					flag=1;
				}
				if(flag==0)
				{
					break;
				}
			}
			System.out.println();
		}
		for(int r = 0;r<a.length;r++)
		{
			System.out.print(a[r]);
		}
	}

}
