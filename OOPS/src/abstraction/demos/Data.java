package abstraction.demos;

abstract class Base
{
	abstract void fun();
	
}
class Derived extends Base
{

	@Override
	void fun() {
	System.out.println("Derived fun called");
		
	}
	
}
public class Data {
public static void main(String[] args) {
	Base b=new Derived();
	b.fun();
}
}
