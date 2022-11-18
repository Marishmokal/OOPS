package abstraction.demos;

abstract class Shapes {
	String colour;

	abstract double area();

	public abstract String toString();

	public Shapes(String colour) {
		this.colour = colour;
		System.out.println("Shapes constructer");
	}

	public String getColour() {
		return colour;
	}
}

class Circle extends Shapes {
	double radius;
	
	Circle(String colour,double radius)
	{
		super(colour);
		this.radius=radius;
		System.out.println("Circle constructer");
	}

	@Override
	double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is " + super.getColour()
        + "and area is : " + area();
	}
}
class Rectangle extends  Shapes
{
	double length;
	double width;
	
	Rectangle(String colour,double length,double width)
	{
		super(colour);
		this.length=length;
		this.width=width;
		System.out.println("rectangle constructer");
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is " + super.getColour()
        + "and area is : " + area();
	}
}

public class Test {
	public static void main(String[] args) {
		Shapes s1=new Circle("red",2.2);
		Shapes s2=new Rectangle("yesllow",2,4);
	}
}


