package hasSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainStdBook 
{
	public static void main(String[] args)
	{
		ArrayList<Student>obj =new ArrayList <Student>();
		
		obj.add(new Student("Name","Branch",00));
		obj.add(new Student("Ankur","Mech",30));
		obj.add(new Student("Om","Auto",20));
		obj.add(new Student("Hello","Hrm",10));
		
		for (Student a : obj)
		{
			System.out.println(a);
		}
		
		System.out.println();
		
		ArrayList <Book> bk = new ArrayList<Book>();
		
		bk.add(new Book("Book Name","Author Name       ",00));
		bk.add(new Book("Tayal    ","Laxmi Publication ",200));
		bk.add(new Book("Thermo   ","PK Nag            ",1000));
		bk.add(new Book("Mechanics","Hello Buddy       ",300));
		
		for(Book a : bk)
		{
			System.out.println(a);
		}
		
		System.out.println("\t\t");
		Collections.sort(obj);
		for(Student a : obj)
		{
			System.out.println(a);
		}
		
		System.out.println("\t\t");
		
		Collections.sort(bk);
		for(Book a : bk)
		{
			System.out.println(a);
		}
	    		
	}

}
