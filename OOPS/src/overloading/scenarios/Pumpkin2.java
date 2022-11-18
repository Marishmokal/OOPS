package overloading.scenarios;
class Addition
{
	public static void testMethod(long a)
	{
		System.out.println("long type");
	}
	public static void testMethod(int b)
	{
		System.out.println("int type");
	}
	public static void testMethod(Integer c)
	{
		System.out.println("Integer type");
	}
	public static void testMethod(double c)
	{
		System.out.println("double type");
	}
	public static void testMethod(Number c)
	{
		System.out.println("number type");
	}
}
public class Pumpkin2 {
public static void main(String[] args) {
	Addition.testMethod(10);
}
}
