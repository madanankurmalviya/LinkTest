package hasSet;

public class Student implements Comparable
{
	private String Name;
	private String Branch;
	private int Age;
	
	public Student(String name,String branch,int age)
	{
		this.Name=name;
		this.Branch=branch;
		this.Age=age;
	}
	
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		this.Name = name;
	}
	public String getBranch() 
	{
		return Branch;
	}
	public void setBranch(String branch)
	{
		this.Branch = branch;
	}
	public int getAge() 
	{
		return Age;
	}
	public void setAge(int age)
	{
		this.Age = age;
	}
	
	@Override
	public String toString()
	{
		return Name+"\t\t"+Branch+"\t\t"+Age;
	}
	@Override
	public int compareTo(Object compst) 
	{
		int compAge =((Student) compst).getAge();
		return this.Age-compAge;
	}

	

}
