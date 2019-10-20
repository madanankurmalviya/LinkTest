package Testing;

public class InhertCLass extends B
{
	void c()
	{
		System.out.println("Here are the print from C");
	}

	public static void main(String[] args) 
	{
		InhertCLass aa= new InhertCLass();
		aa.a();
		aa.b();
		aa.c();
	}

}
