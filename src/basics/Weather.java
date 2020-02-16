package basics;

public class Weather {
	public static void main(String[] args){
		int temperature=45;
		String sunCondition = "Overcast";
		
		if(temperature>80){
			System.out.println("It's a pleasant, Wear shorts and t-shirt");
		}else if(temperature>60 && sunCondition=="Sunny"){
			
			System.out.println("It's a little cooler, perhaps wear a long sleeve shirt and jeans");
			System.out.println("Wear a hat");
		}
		else if(temperature >50 || sunCondition=="Overcast"){
			System.out.println("This is a cool day make sure to wear warmer clothes");
		}
		else{
			System.out.println("Look like a cold day bring a sweater");
		}
		System.out.println("The program is ending");
		
	}
	
}
