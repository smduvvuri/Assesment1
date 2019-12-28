package wallet.entity;
public class Walllet {
	public Walllet(String mobileno, String name, double balance)
	{
	 this.mobileno=mobileno;
	 this.name=name;
	 this.balance=balance;
	}
	private String mobileno;
	public String getMobileNo()
	{
		return mobileno;
	}
	public void setMobileNo(String mobileno)
	{
		this.mobileno=mobileno;
	}
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	private double balance;
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void transferAmount(Walllet w, double amount) {
		this.balance = this.balance - amount;
		w.balance = w.balance + amount;
	}}
	


