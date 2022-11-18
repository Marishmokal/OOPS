package Overriding.scenarios;
class Shape
{
	public void draw()
	{
		System.out.println("shape");
	}
	public void filled()
	{
		System.out.println("shape filled with colour");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("circle");
	}
}
class Square extends Shape
{
	public void draw()
	{
		System.out.println("square");
	}
	
}
class Hexagon extends Shape
{
	public void draw()
	{
		System.out.println("Hexagon");
	}
}
public class PumpkinDemo {
public static void main(String[] args) {
	Shape s=new Circle();
			s.draw();
	s.filled();
}
}
