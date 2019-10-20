package String;

import java.util.Arrays;

public class RevOddStringArray
{
	public static void main(String[]args)
	{
			String st ="Hi my name is ankur malviya";
			String [] stArr = st.split(" ");
			String rev=" ";
			for (int i = 0 ; i < stArr.length; i ++)
			{
				
				if(i%2!=0)
				{
					String ab = stArr[i]; 
					for (int a =ab.length()-1 ; a >= 0 ;a--)
					{
						rev = " " + ab.charAt(a);
					}
					System.out.print(rev);	
				}
			}
	}	
}

