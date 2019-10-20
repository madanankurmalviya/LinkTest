package others;
import java.util.Scanner;
import java.util.ArrayList;
public class ReverseStringOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str =sc.nextLine();
		System.out.println(str);
		
		String[] stt = str.split(" ");
		int count = stt.length;
		System.out.println(count);
		String rev="";
		
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0 ; i< count ; i++)
		{
			StringBuffer sb = new StringBuffer(stt[i]);
			if(i/2==1)
			{
				sb.reverse();
				rev=rev+sb;
			}
			else
			{
				
			}
		}
		
		
		
	}

}
