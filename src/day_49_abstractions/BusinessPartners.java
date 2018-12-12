package day_49_abstractions;

public class BusinessPartners {
	
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		ba1.name = "Google";
		ba1.accountNumber = 4321567;
		ba1.balance = 2000000;
		ba1.type = "Business Account";
		
		BankAccount ba2 = new BankAccount();
		ba2.name = "James Bond";
		ba2.accountNumber = 123789;
		ba2.type = "Personal Account";
		ba2.balance = 400;
		System.out.println(ba1.balance);
		ba1.deposit(120000);
		System.out.println(ba1.balance);
		ba1.withdraw(3000000);
		ba1.transfer(1600000, ba2);
		System.out.println("google balance: " + ba1.balance);
		System.out.println("James bond balance: " + ba2.balance);
		
		SavingsAccount sa = new SavingsAccount();
		sa.balance = 300;
		sa.accountNumber = 234232;
		sa.withdraw(300);
	}

}













