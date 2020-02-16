package basics;

public class NumbersCalc {
	
	public static void main(String[] args){
		System.out.println("Program is starting");
		 printName();
		 int numA=10;
		 int numB=20;
		 addNumbers(numA,numB);		
		 System.out.println("The product is: " + multiplyNumbers(numA,numB));
		 }

	static void printName(){
		System.out.println("My name is Safwen");
	}
	
	static void addNumbers(int numberA, int numberB){
		int sum = numberA + numberB;
		System.out.println("Sum is "+ sum);
		}
	
	static int multiplyNumbers(int valueA,int valueB){
		int product = valueA * valueB;
		addNumbers(product,product);
		return product;           
		
	}
	
	
}
