package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define an array
		
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println("**********************");
		
		//Declare the array
		String[] states = new String[5];
		states[0]="California";
		states[1]="Ohio";
		states[2]="New Jersey";
		states[3]="Texas";
		states[4]="Utah";
		int i=0;
		do{
		System.out.println(states[i]);
		i=i+1;
		
		
		}while(i<5);
		System.out.println("*******************");
		int n=0;
		boolean stateFound=false;
		while(!stateFound){
			String state = states[n];
			System.out.println(state);
			if(state == "Texas"){
				System.out.println("State found!!");
				stateFound = true;
			}
			n++;
		}
		
		//for Loop: best structure for iterating an array
		
		for(int x=0; x<5;x++){
			System.out.println(states[x]);
		}
		
		
		
		
		

	}

}
