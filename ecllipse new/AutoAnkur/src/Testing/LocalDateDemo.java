package Testing;

import java.time.LocalDate;

public class LocalDateDemo
{
	public static void main(String[] args) 
	{
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDate tmrw = ld.plusDays(1);
		System.out.println(tmrw);
		LocalDate tr = ld.plusYears(1);
		System.out.println(tr);
		LocalDate tm=ld.minusWeeks(1);
		System.out.println(tm);
				
		
	}

}
