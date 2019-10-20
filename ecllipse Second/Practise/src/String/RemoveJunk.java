package String;

public class RemoveJunk {

	public static void main(String[] args)
	{
		String a= "aah123@#$     djhshbvdhs$$$&&222  23";
		a=a.replaceAll("[^a-zA-Z0-1]","");
		System.out.print(a);
	}
}
