package day_49_abstractions;

public class SavingsAccount extends BankAccount{

	@Override
	public boolean transfer(int transferAmount, BankAccount targetAccount) {
		double fee = (transferAmount * 8)/100;
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
	
	@Override
	public void withdraw(int withdrawAmount) {
		double fee = (withdrawAmount * 2) /100;
		if(this.balance >= withdrawAmount + fee) {
			System.out.println(withdrawAmount + " is withdrown from " + this.accountNumber);
			this.balance -= (withdrawAmount + fee);
		}
		else {
			System.out.println("Not sufficient balance in " + this.accountNumber);
		}
	}
	
	
}














