package constructors;

public class ConstExmp
{	
		int age;
		String name;
		float sno;
	
		ConstExmp()
		{
			this.name="Ankur";
			this.age=30;
		}
		ConstExmp(int a,String b,float d)
		{
			this.name=b;
			this.age=a;
			this.sno= d;
		}
	public static void main(String[] args)
	{
		ConstExmp obj1= new ConstExmp();
		ConstExmp obj2 = new ConstExmp(30,"Malviya", 2);
		System.out.println(obj1.name+" "+obj1.age+"  "+obj1.sno);
		System.out.println(obj2.name+" "+obj2.age+"  "+obj2.sno);
	}

}
