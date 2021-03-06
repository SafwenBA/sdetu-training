package oop;

public class BankAccount implements Irate {
	//define variables
	String accountNumber;
	//static --belongs to the CLASS not the object instance
	//final -- constant (often static final)
	private static final String routingNumber = "013546";
	
	//Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance=0;
	
	//Constructor definitions: unique methods
		//1.they are used to define/ setup/initialize properties of an object
		//2.Constructors are IMPLICITLY called upon instantiation
		//3.The same name as the class itself
		//4.constructors have No return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	//Overloading: Call same method name with different arguments
	
	BankAccount(String accountType){
		
		System.out.println("NEW ACCOUNT: "+ accountType);
		
	}
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: "+ accountType);
		System.out.println("INITIAL DEPOSIT OF: $"+ initDeposit);
		String Msg=null;
		if(initDeposit<1000){
			 Msg="EROOR: Minimum deposit must be at least $1000";
			
		}else{
			 Msg="Thanks for your initial depostif of $"+ initDeposit;
		}
		System.out.println(Msg);
		balance=balance + initDeposit;  
	}
	
	//Getters / Setters
	
	//Allow the user to define the name
	
	public void setName(String name){
		this.name = "Mr." + name;
		
	}
	public String getName(){
		return name;
	}
	
	//Source --> getters and setters -->ssn
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface methods
	public void setRate(){
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate(){
		System.out.println("INCREASING RATE");
		
	}

	//Define methods
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount){
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	//Private: can only be called from within the class
	private void showActivity(String activity){
		System.out.println("Your RECENT TRANSACTION: "+ activity); 
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
		
	}
	
	void checkBalance(){
		System.out.println("Balance: "+ balance);
		
	}
	
	void getStatus(){
		
	}
	@Override
	public String toString(){
		return "[NAME: " + name + ", ACCOUNT#" + accountNumber + " ,ROUTING#"+ routingNumber+ ", BALANCE: $" + balance + " ]";
	}
}
