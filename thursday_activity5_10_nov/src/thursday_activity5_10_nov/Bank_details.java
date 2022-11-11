package thursday_activity5_10_nov;

public class Bank_details {
	private Bank[] account;
	private int entry;
	
	Bank_details()
	{
		account = new Bank[5];
	}
	public void checkBalance(Bank input)
	{
		if(entry<account.length) {
			account[entry]=input;
			entry++;
		}
		if(input.getBalance()<(999)) {
			System.out.println("Low balance account "+ input.getName()+" "+input.getPan_no()+" "+input.getBalance());
		}
		
	}

	public static void main(String[] args) {
		
		Bank b1=new Bank("sumaiya",01,500);
		Bank b2= new Bank("john",04,100);
		
		
		Bank_details bd1=new Bank_details();
		bd1.checkBalance(b1);
		bd1.checkBalance(b2);



	}

}
