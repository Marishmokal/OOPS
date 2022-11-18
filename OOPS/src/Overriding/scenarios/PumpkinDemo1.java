package Overriding.scenarios;
class Shape1
{
	public static void draw()
	{
		System.out.println("Shape");
	}
}
class Circle1 extends Shape1
{
	public static void draw()
	{
		System.out.println("Circle");
	}
}
public class PumpkinDemo1 {
public static void main(String[] args) {
	Circle1 c=new Circle1();
	c.draw();
}
}
