package SingaltonDesignPattren;

public class Singleton {
	
	private static Singleton singleton = null; 
	
	
	/*
	There are certain points that one needs to consider while creating a singleton class –

	Constructor of the singleton class should be declared as private so that it can’t be instantiated outside the class.
	Write a static method that has a return type of object of this singleton class. This is also called Lazy Initialization.
			
	*/
	private  Singleton() {
		
		System.out.println("This is Singleton class");
		
	}
	
	// Declare a method to return object of singleton
	
	public static Singleton getInstance() {
		
		if(singleton==null) {
			singleton = new Singleton(); 
			
			return singleton;
		}
		
		else {
			return singleton;
		}
	}

	public static void main(String[] args) {
		

	}

}
