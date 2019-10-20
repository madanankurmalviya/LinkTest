package staticBlock;
class MyNested
{
	private static String name = "Ankur Malviya";
	static class MyNestedStatic
	{
		public void disp()
		{
			System.out.println("Here is the name of prog= "+name);
		}
	}
	public static void main(String[] args) 
	{
		MyNested.MyNestedStatic obj = new MyNested.MyNestedStatic();
		obj.disp();
	}
}


