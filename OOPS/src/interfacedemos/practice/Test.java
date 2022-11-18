package interfacedemos.practice;
interface Printable
{
void print();	
}
class A6 implements Printable
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}
public class Test {
public static void main(String[] args) {
	A6 a=new A6();
	a.print();
}
}
