package abstraction.demos;
abstract class Show
{
	abstract void result();
	void message()
	{
		System.out.println("this method is showing result");
	}
}
class ShowSum extends Show
{
	int a=2,b=10,c;

	@Override
	void result() {
	c=a+b;	
	message();
	System.out.println("sum is:-"+c);
	}	
}
class ShowSubtract extends Show
{
	int a=12,b=2,c;

	@Override
	void result() {
		c=a-b;
		message();
		System.out.println("substraction is:-"+c);
	}
	
}
public class Work_abstract {
public static void main(String[] args) {
	ShowSubtract minus=new ShowSubtract();
	ShowSum add=new ShowSum();
	add.result();
	minus.result();
}
}
