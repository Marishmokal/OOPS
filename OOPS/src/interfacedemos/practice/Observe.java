package interfacedemos.practice;
interface Copyable
{
	void print();
}
interface Showable
{
	void show();
}
class A7 implements Copyable,Showable
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show something");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print something");
	}
	
}
public class Observe {
public static void main(String[] args) {
	A7 a=new A7();
	a.print();
	a.show();
}
}
