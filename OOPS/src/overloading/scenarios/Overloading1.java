package overloading.scenarios;
class Adding
{
	static int sum(int a,int b)
	{
		return a+b;
	}
	static double sum(double a,double b,double c)
	{
		return a+b+c;
	}
}
public class Overloading1 {
public static void main(String[] args) {
	System.out.println(Adding.sum(10,5));
	System.out.println(Adding.sum(2.5,2.5,2.5));
}
}
