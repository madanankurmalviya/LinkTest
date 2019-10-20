package methods;

class Animal1
{
	void animalSound(String a)
	{
		System.out.println("Here is the main Animal Class= "+a);
	}

	void animalSound(String b , int c)
	{
		System.out.println("Here is the cat class = "+b+"***"+c);
	}

	void animalSound(String d , int e , String f)
	{
		System.out.println("Here is the Dog = "+d+"---"+e+"***"+f);
	}
}
public class MethodOverLoading
{
	public static void main(String[]args)
		{
			Animal1 x = new Animal1();
			x.animalSound("Ankur Malviya");
			x.animalSound("Ankur",30);
			x.animalSound("Ankur",20,"Malviya");
		}
}
