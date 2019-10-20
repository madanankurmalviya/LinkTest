package HashMap;

public class Employee 
{
	private String EmployeeName;
	private int EmployeeId;
	private int Salary;
	private String Work;
	
	public String getEmployeeName()
	{
		return EmployeeName;
	}
	public void setEmployeeName(String name)
	{
		EmployeeName=name;
	}
	
	public int getEmployeeId()
	{
		return EmployeeId;
	}
	public void setEmployeeId(int id)
	{
		EmployeeId=id;
	}
	
	public int getSalary()
	{
		return Salary;
	}
	public void setSalary(int salary)
	{
		Salary=salary;
	}
	
	public String getWork()
	{
		return Work;
	}
	public void setWork(String work)
	{
		Work=work;
	}
	
	public String toString()
	{
		return EmployeeName+"\t"+EmployeeId+"\t"+Salary+"\t"+Work;
	}
	
}
