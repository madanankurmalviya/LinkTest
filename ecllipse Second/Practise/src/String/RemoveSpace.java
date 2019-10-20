package String;

public class RemoveSpace {

	public static void main(String[] args) 
	{
		String s= "a@zzzzzhdb546546,,5AABBZZZsd7373737***&&@@*@kfbkwYYjbfwf";
		
		System.out.print(s);
		String abc = s.replaceAll("[^a-zA-Z]", "");
		System.out.println();
		System.out.print(abc);
		
		

	}

}
