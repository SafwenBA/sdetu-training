package oop;

public class LoanAccount implements Irate {

	@Override
	public void setRate() {
		System.out.println("RATE");
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase RATE");
		
	}
	
	public void setTerm(int term){
		System.out.println("Setting the term to: "+ term + "years");
	}
	
	public void setAmmortSchedule(){
		System.out.println("Amortization schedule");
	} 



}
