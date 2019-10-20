package TypeCastings;
class A
{
	int x=10;
}
class B extends A
{
	int y=20;
}
class C extends B
{
	int z=30;
}

class MainA
{
	public void method(A a)
	{
		System.out.println(a.x);
		B b=(B)a;
		System.out.println(b.y);
		C c = (C)a;
		System.out.println(c.z);
	}
}

class Main
{
	public static void main(String [] args)
	{
		MainA d = new MainA();
		d.method(new B());
		d.method(new C());
		d.method(new A());
		
	}
}