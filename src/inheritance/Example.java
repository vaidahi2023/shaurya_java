package inheritance;
//Write a Java programming to create a banking system with three classes - 
//Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. 
//Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. 
//SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods
interface Account 
{
	void deposit(int amt);
	void withdraw(int amt);
	void viewbalance();
	
}
class SavingsAccount implements Account 
{

	int bal,amt;
	public void deposit(int amt) {	
		bal=bal+amt;
		
	}
	
	public void withdraw(int amt) {
		bal=bal-amt;
	}

	@Override
	public void viewbalance() {
		System.out.println("bal="+bal);
		
	}

	
}
class CurrentAccount implements Account 
{
	int bal,amt;
	
	public void deposit(int amt) {	
		bal=bal+amt;
		
	}
	
	public void withdraw(int amt) {
		bal=bal-amt;
	}

	@Override
	public void viewbalance() {
		System.out.println("balance="+bal);
		
	}	
}
public class Example {

	
	public static void main(String[] args) {
		
		SavingsAccount s=new  SavingsAccount();
		s.bal=10000;
		s.deposit(200);
		s.withdraw(5000);
		s.viewbalance();
		
		CurrentAccount c=new CurrentAccount();
		c.bal=10000;
		c.deposit(200);
		c.withdraw(5000);
		c.viewbalance();
	}
}
