package overloading.scenarios;
class DisplayOverloading
{
	public void display(char n,int m)
	{
		System.out.println("i m the first");
	}
	public void display(int var1,char b)
	{
		System.out.println("i m the second");
	}
}
public class Sample {
public static void main(String[] args) {
	DisplayOverloading d=new DisplayOverloading();
	d.display('c',10);
	d.display(10,'b');
}
}
