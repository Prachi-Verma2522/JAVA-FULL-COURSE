
class Authenticate{
	
	void login(String email, String password) {
		System.out.println("Logged in with email and password");
	}
	
	void login(String phone, int otp) {
		System.out.println("Logged in with phone and otp");
	}
	
	void login(String googleEmail) {
		System.out.println("Logged in with Google");
	}
	
}
public class MethodOverloading {
/*	
	 	// Polymorphism:
	 		Method Overloading -> More than 1 forms for the method
	 		->allows us to perform a single task in different ways
	 		->Types of POLYMORPHISM:-
	 		1. compile time poly->method overloading
	 		2. run time poly-> method overriding
	 	
	    -> Rules
	 	   1. Method name is same
	 	   2. Inputs should be unique:
	 	   	  2.1 number of inputs
	 	   	  2.2 type of inputs
	 	   	  2.3 sequence of inputs
	 	   3. Return type has no role to play 
	 	
	 */
	
	static void add(int a, int b) {
		int sum = a + b;
		System.out.println("sum of 2 numbers is: "+sum);
	}
	
	// duplicating the method: below is error as only the variable name is different rest everything is same and does the same work
	/*static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}*/
	
	// number of inputs
	static void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("sum of 3 numbers is: "+sum);
	}
	
	// data type of inputs
	static void add(double a, double b) {
		double sum = a + b;
		System.out.println("sum of 2 double numbers is: "+sum);
	}
	
	// Sequence of inputs
	static void add(int a, double b) {
		double sum = a + b;
		System.out.println("sum of 2 double numbers is: "+sum);
	}
	
	static void add(double a, int b) {
		double sum = a + b;
		System.out.println("sum of 2 double numbers is: "+sum);
	}
	
	public static void main(String[] args) {
		
		add(20,30);
		add(22, 33, 44);
		add(34.22, 13.33);
		add(35, 2.2);
		add(5.5, 25);
		
		Authenticate auth = new Authenticate();
		auth.login("hella@gmail.com", "123passcode");
		auth.login("+91 332 223 444 1", 2114);
		auth.login("elle12@gmail.com");
	}

}
