package ArrayListExmp;

import java.util.ArrayList;

public class StudentExm 
{

	public static void main(String[] args) 
	{
		ArrayList <Student> obj = new ArrayList<Student>();
		obj.add(new Student("Ankur Malviya",30));
		obj.add(new Student("Hello",20));
		obj.add(new Student("Mechanical Mentors",10));
	for(Student temp: obj)
	{
		System.out.println(temp);
	}
	}

}