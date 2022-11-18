package interfacedemos.practice;
interface Drawable
{
	void draw();
}
class Circle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw circle");
	}
	
}
class Rectangle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw rectangle");
	}
	
}
public class Data {
public static void main(String[] args) {
	Drawable c=new Circle();
	c.draw();
	
}
}
