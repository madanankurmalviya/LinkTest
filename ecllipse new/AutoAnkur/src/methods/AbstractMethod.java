package methods;
abstract class Animal
{
	 abstract public void animalSound();
}
class Dog extends Animal
{
	public void animalSound()
	{
		System.out.println("Barking");
	}
}
public class AbstractMethod 
{

	public static void main(String[] args) 
	{
		Animal a = new Dog();
		a.animalSound();
	}

}
