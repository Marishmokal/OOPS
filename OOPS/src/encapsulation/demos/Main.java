package encapsulation.demos;
class Account
{
	private String name;
	private long accNo;
	private int balance;
	private String branch;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public long getAccNo()
	{
		return accNo;
	}
	public void setAccNo(long accNo)
	{
		this.accNo=accNo;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
}
public class Main {
public static void main(String[] args) {
	Account a=new Account();
	a.setName("Marish Mokal");
	a.setAccNo(1234567898);
	a.setBalance(55456);
	a.setBranch("pune");
	System.out.println(a.getName());
	System.out.println(a.getAccNo());
	System.out.println(a.getBalance());
	System.out.println(a.getBranch());
	
}
}
