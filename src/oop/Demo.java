package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name+" is walking");		
	}
	
	void eat(){
		System.out.println(email);	
		
	}
	void sleep(){
		System.out.println(name+" is sleeping");	
		
	}
}


public class Demo {

	public static void main(String[] args) {
	//	Initializing an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name ="Joe";
		person1.email="hoe@testemail.com";
		person1.phone="87464654";
		
		//Abstraction
		person1.walk();
		
		
		
		
		/*
		
		//Person
		
		//Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "Joe@gmail.com";
		String phone = "878789456";
				
		//action, activity, behaviour
		
		walking(name);
		System.out.println(name +" is eating");
		
		//what if we wanted to do this for another person?
		
		String name2 = "Sarah";
		String email2 = "Sarah@gmail.com";
		String phone2 = "897435465";
				
		//action, activity, behaviour
		
		walking(name2);
		System.out.println(name +" is eating");
		//what about binding attributes and properties together?
		
	}
		
		//Enhance by adding functions to minimize code
		
		static void walking(String name){
			System.out.println(name+" is walking");
			*/
		}
		
		
		

	}




