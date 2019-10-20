package ArrayListExmp;

public class StudentData 
{
	private String Name;
	private int Age;
	
	public StudentData(String name , int age)
	{
		this.Name=name;
		this.Age=age;
	}
	public String getName()
	{
		return this.Name;
	}
	public void setName(String name)
	{
		this.Name=name;
	}
	
	public int getAge()
	{
		return this.Age;
	}
	public void setAge(int age)
	{
		this.Age=age;
	}
	
	public String toString()
	{
		return this.Name+"\t\t"+this.Age;
	}

	public int compareTo (StudentData comp) 
	{
		int comage = ((StudentData)comp).getAge();
		return this.Age-comage;
	}
	
}