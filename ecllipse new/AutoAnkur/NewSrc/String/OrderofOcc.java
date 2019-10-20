package String;
public class OrderofOcc {
//	
//	static void countEachChar(String str)
//	{
//		int counter[]=new int[256];
//		int len = str.length();
//		for(int row = 0;row<len ;row++)
//			{
//			 counter[str.charAt(row)]++;
//			}
//		char array []=new char[str.length()];
//		for(int row = 0;row<len ;row++)
//		{
//			array[row]=str.charAt(row);
//			int flag=0;
//			for(int col=0;col<=row;col++)
//			{
//				if(str.charAt(row)==array[col])
//					flag++;
//			}
//			if(flag==1)
//				System.out.println("Occurence of char : "+str.charAt(row)+" "+"in the String is : "+counter[str.charAt(row)]);
//		}
//			
//	}
	public static void main(String[] args) {
		String str = "A";
//		countEachChar(str);
		System.out.print(str.length());
	}
}
