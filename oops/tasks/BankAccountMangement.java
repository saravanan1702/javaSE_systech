package oops.tasks;

import java.util.ArrayList;

class Account {
	// attirubutes
	private String name;
	private String Accno;
	private double balance;

	// constructor
	Account(String name, String accno, double bal) {
		this.name = name;
		this.Accno = accno;
		this.balance = bal;
	}

	// getter and setter method to setting values for private method
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getAccno() {
		return Accno;
	}

	void setAccno(String Accno) {
		this.Accno = Accno;
	}

	double getBalance() {
		return balance;
	}

	void set(double bal) {
		this.balance = bal;
	}

	void deposite(double amt) {
		balance += amt;
	}

	void withdraw(double amt) {
		if (balance < amt) {
			System.out.println("Insufficent Balance");
		} else {
			balance -= amt;
		}
	}

	public String getAccountInfor() {
	
		System.out.println("Name :" + name);
		System.out.println("AccountNo :" + Accno);
		System.out.println("Main Balance :" + balance);
		return "";
	}

}

class Bank {
	// creating array list for manipulate account
	private ArrayList<Account> acc;/// creating arraylist object

	Bank() {
		acc = new ArrayList<Account>();// assigning arrayList object
	}

	// add method
	void addAccount(Account account) {
		acc.add(account);
	}

	// remove Method
	void removeAccount(Account account) {
		acc.remove(account);
	}

	void depositeMoney(Account account, double amnt) {
		account.deposite(amnt);
	}

	void withdraw(Account account, double amnt) {
		account.withdraw(amnt);
	}

	public ArrayList<Account> getAccount() {
		return acc;
	}
}

public class BankAccountMangement {
	public static void main(String[] args) {
		Bank bank = new Bank();
		// creating object for account class
		Account a1 = new Account("Jasmine", "10293448", 10000);
		Account a2 = new Account("Saravanan", "102935848", 1000);
		Account a3 = new Account("Jasmine", "10293448201", 5000);
		// add account details to bank
		bank.addAccount(a1);
		bank.addAccount(a2);
		bank.addAccount(a3);
		ArrayList<Account> acc = bank.getAccount();
		for (Account x : acc) {
			System.out.println(x.getAccountInfor());
		}
		System.out.println("After Deposite 1000 into account-1 :");
		bank.depositeMoney(a1, 1000);
		System.out.println(a1.getAccountInfor());
		System.out.println("No transition in Account-2");
		System.out.println(a2.getAccountInfor());
		System.out.println("After Withdrawing 2000 from account-3");
		bank.withdraw(a3, 2000);
		System.out.println(a3.getAccountInfor());
		
	}
}
