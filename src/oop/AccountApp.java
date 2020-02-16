package oop;

public class AccountApp {

	public static void main(String[] args) {
		
		//Polymorphism : changes where we are pointing
		Irate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
	}

}
