package abstraction.demos;

abstract class Animal
{
	public abstract void animalSound();
	
	public void sleep()
	{
		System.out.println("Zzzzzzzzz");
	}	
}
class Pig extends Animal
{

	@Override
	public void animalSound() {
		System.out.println("Pig says weee weee");
		
	}
	
}
public class Main {
public static void main(String[] args) {
	Pig p=new Pig();
	p.animalSound();
	p.sleep();
}
}
