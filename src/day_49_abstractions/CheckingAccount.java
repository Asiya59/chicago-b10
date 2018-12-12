package day_49_abstractions;

public class CheckingAccount extends BankAccount{

	@Override
	public boolean transfer(int transferAmount, BankAccount targetAccount) {
		double fee = (transferAmount * 3)/100;
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
