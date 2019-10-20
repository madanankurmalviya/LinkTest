package StringExmp;

public class occExmp
{
	static int count = 0;
	public static void main(String[]args)
	{   
		String str = "Om Ganeshay Nama";
		char[] strArry = str.toCharArray();
		System.out.println(strArry);
		for(int a=0;a<strArry.length;a++)
		{
			
			for(int b=0;b<=a;b++)
			{
				if(strArry[a]==strArry[b]) 
				{
					count++;
				}
			}
			System.out.print(strArry[a]);
			System.out.println(" : "+count);
			count=0;
		}
	}

}
