package interfacedemos.practice;
interface Animal
{
	public void animalSound();
	public void sleep();
}
class Pig implements Animal
{

	@Override
	public void animalSound() {
	System.out.println("ewwwwwwwww");
		
	}

	@Override
	public void sleep() {
	System.out.println("Zzzzzzzzz");
		
	}
	
}
public class Main {
public static void main(String[] args) {
	Pig S=new Pig();
	S.animalSound();
	S.sleep();
	
}
}
