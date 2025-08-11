package helloworld.java;

public class Bank {
	static int currentBalance =1000;
	public static void greetCustomer() {
		System.out.println("Hello,customer welcome to banking application.");
	}
	public void deposit(int amount) {
		currentBalance =currentBalance + amount;
		System.out.println("Amounrt is Deposited Successfully!");
	}
	public static void withdrawal(int amount) {
		currentBalance =currentBalance - amount;
		System.out.println("Amounrt is Withdrawn Successfully!");
	}
	public int getCurrentBalance() {
		return currentBalance;
	}
	public static void main(String[] args) {
		Bank bank=new Bank();
		greetCustomer();
		System.out.println("Current Balance is: "+ bank.getCurrentBalance());
		bank.deposit(500);
		System.out.println("Current Balance is: "+ bank.getCurrentBalance());
		withdrawal(300);
		System.out.println("Current Balance is: "+ bank.getCurrentBalance());
	}

}
