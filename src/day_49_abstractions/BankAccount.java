package day_49_abstractions;

public class BankAccount {
	
	String name;
	String type;
	double balance;
	int accountNumber;
	
	public void deposit(int depositAmount) {
		System.out.println(depositAmount + " is deposited to " + this.accountNumber);
		this.balance+=depositAmount;
	}
	
	public void withdraw(int withdrawAmount) {
		if(this.balance >= withdrawAmount) {
			System.out.println(withdrawAmount + " is withdrawn from " + this.accountNumber);
			this.balance-=withdrawAmount;
		}
		else {
			System.out.println("Not sufficient money in " + this.accountNumber);
		}
	}
	
	public boolean transfer(int transferAmount, BankAccount targetAccount) {
		double fee = (transferAmount * 5)/100;
		if(this.balance >= transferAmount+fee) {
			System.out.println(transferAmount + " is transferred from " + this.accountNumber + " to " + targetAccount.accountNumber );
			this.balance -= transferAmount+fee;
			targetAccount.balance+= transferAmount;
			return true;
		}
		else {
			System.out.println("Not sufficient money in " + this.accountNumber);
			return false;
		}
	}
	
	

}








