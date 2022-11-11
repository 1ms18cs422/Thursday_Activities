package thursday_activity5_10_nov;

public class Bank {

	private String name;
	private int pan_no;
	private double balance;
	Bank(){
		
	}
	Bank(String n,int p,double bal){
		name=n;
		pan_no=p;
		balance=bal;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
	this.name=name;
	}
	public int getPan_no()
	{
		return pan_no;
	}
	public void setName(int pan_no) {
	this.pan_no=pan_no;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public void setName(double balance) {
	this.balance=balance;
	
	
	}
}
