package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		//fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		//fib(0)=0
		//fib(1)=1
		//fib(2)=fib(1)+fib(0)=0+1=1
		//fib(3)=fib(2)+fib(1)=1+1=2
		//fib(4)=fib(3)+fib(2)=1+2=3
		//fib(5)=fib(4)+fib(3)=2+3=5
		System.out.println(fac(3));

	}
	public static int fac(int n){
		if(n==0){
			return 1;
		}
		else if(n==1){
			return 1;
		}
		return (n*fac(n-1));
	}
	

}
