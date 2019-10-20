package ArrayListExmp;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudentData 
{

	public static void main(String[] args)
	{
		ArrayList <StudentData> obj = new ArrayList<StudentData>();
		obj.add(new StudentData("Ankur",200));
		obj.add(new StudentData("Malviya",300));
		obj.add(new StudentData("Om",10));
		for(StudentData a : obj)
		{
			System.out.println(a);
		}
	System.out.println(obj);
	}

}
