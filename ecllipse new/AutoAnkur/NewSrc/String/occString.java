package String;
public class occString
{
public static void main(String args[])
  {
	String str="AnkurA";
	int c=0;
	char[] strArray=str.toCharArray();
	System.out.println(strArray);
	for(int i=0;i<strArray.length;i++)
	    {
			for(int j=0;j<strArray.length;j++)
				{
					if(strArray[i]==strArray[j])
						{ 
							c++; // counting string numbers 
						}
				}
			      System.out.print(strArray[i]+" : ");
			      System.out.println(c);
			      c=0;
	    }
   }
}
