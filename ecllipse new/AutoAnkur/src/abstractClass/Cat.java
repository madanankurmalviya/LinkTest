package abstractClass;

abstract class Animal
{
	abstract void animalSound();
	
}

class Caat extends Animal
{
	void animalSound()
	{
		System.out.println("Hello Cuitiee");
	}
}
public class Cat
{
	public static void main(String[] args) 
	{	
			Animal a = new Caat();
			a.animalSound();
	}

}
