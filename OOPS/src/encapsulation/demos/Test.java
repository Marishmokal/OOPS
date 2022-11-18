package encapsulation.demos;
class Student
{
	private int rollNo;
	private String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
}
public class Test {
public static void main(String[] args) {
	Student s=new Student();
	s.setName("ram");
	s.setRollNo(10);
	
	System.out.println(s.getName());
	System.out.println(s.getRollNo());
}
}
