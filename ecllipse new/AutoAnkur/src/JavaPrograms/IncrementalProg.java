package JavaPrograms;

public class IncrementalProg 
{
	int a= 1;
	int y=1;
	void incmetal()
	{
		
		int b= a++;
		int z =++b;
		System.out.println(b+"" +a);
		System.out.println(z+" "+a);
	}
	public static void main(String[] args)
	{
		IncrementalProg t=new IncrementalProg ();
		t.incmetal();

	}

}
