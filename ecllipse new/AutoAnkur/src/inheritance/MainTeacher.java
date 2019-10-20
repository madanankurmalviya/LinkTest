package inheritance;

public class MainTeacher extends Teacher
{
	String stat = "Married";

	public static void main(String[] args)
	{
		MainTeacher t = new MainTeacher();
		t.workTeacher();
		System.out.println(t.stat);
		System.out.println(t.name+"***"+t.sem+"----"+t.age);
	}

}
