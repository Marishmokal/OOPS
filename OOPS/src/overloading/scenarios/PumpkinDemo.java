package overloading.scenarios;
class Demos
{
	public static void testMethod(int number)
	{
		System.out.println("printing number");
	}
	public static void testMethod(String str)
	{
		System.out.println("printing string");
	}
	public static void testMethod(int number,String str)
	{
		System.out.println("number and string");
	}
}
public class PumpkinDemo {
public static void main(String[] args) {
	Demos.testMethod(1);
	Demos.testMethod("marish");
	Demos.testMethod(10,"marish");
}
}
