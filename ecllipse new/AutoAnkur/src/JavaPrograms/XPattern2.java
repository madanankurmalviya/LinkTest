package JavaPrograms;

public class XPattern2 {

	public static void main(String[] args) {
		for(int r=0;r<5;r++)
		{
			for(int c=0;c<5;c++)
			{
				if(r==c||r+c==5-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		
			}
			System.out.println( );
		}
		

	}

}
