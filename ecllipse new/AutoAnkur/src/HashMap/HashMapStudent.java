package HashMap;

import java.util.HashMap;

public class HashMapStudent 
{
	public static void main(String[] args) 
	{
		HashMap <Employee,String> emp = new HashMap<Employee,String>();
		
		Employee emp1= new Employee();
		emp1.setEmployeeId(1);
		emp1.setEmployeeName("Prabha Kumari");
		emp1.setSalary(10000000);
		emp1.setWork("CEO Google");
		
		emp.put(emp1, "California");
		
		Employee emp2 = new Employee();
		emp2.setEmployeeId(2);
		emp2.setEmployeeName("Ankur Malviya");
		emp2.setSalary(100000);
		emp2.setWork("Engineer");
		
		emp.put(emp2, "France");
		
		emp.put(emp1, "India");
		emp.put(emp2, "Japan");
		emp.put(emp1, "London");
		
		
		System.out.println(emp);
		 
		System.out.println(emp.values());
		System.out.println(emp.keySet());
		
		
	}

}
