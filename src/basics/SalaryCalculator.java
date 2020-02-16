package basics;

public class SalaryCalculator {
	public static void main(String[] args){
		// Declare a variable
		
		String career;
		System.out.println("Program is starting");
		career="Software Developer";
		System.out.println("My career is " + career);
		//Let's create a variable to define our career
		
		int hoursPerWeek=40;
		int  weeksPerYear=50;
		double rate = 42.50;
		career ="web Developer";
		
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("my salary as a " + career +" at the rate of "+ rate + "is " + salary+" per year");
		
		//Compute our annual salary
		//rate * hoursPerWeek * weeksPerYear
	}

}
