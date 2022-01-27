
class Customer{
	
	String name;
	String phone;
	String email;
	boolean isPrime;
	String membershipRenewalDueDate;
	boolean musicAccess;
	boolean videoAccess;
	
	/*Customer(){
		// .. initialize with some default data
	}*/
	
	private Customer(boolean isPrime){
		
		this.isPrime = isPrime;
		
		if(isPrime) {
			membershipRenewalDueDate = "20th feb, 2023";
			musicAccess = true;
			videoAccess = true;
		}
	}
	
	Customer(String name, String phone, String email, boolean isPrime){
		
		this(isPrime); // execute the above constructor
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		
	}
	
	void showCustomer() {
		System.out.println("Customer Details");
		System.out.println(name+" "+phone+" "+email);
		if(isPrime) {
			System.out.println("Prime Benefits: ");
			System.out.println("Membership Renews on "+membershipRenewalDueDate);
			System.out.println("Video Access: "+videoAccess);
			System.out.println("Music Access: "+videoAccess);
		}
		System.out.println();
	}
	
}


public class ConstructorsChaining {

	public static void main(String[] args) {
	
		Customer c1 = new Customer("Rock", "+91 99999 11111", "rock@gamil.com", false);
		Customer c2 = new Customer("Elle", "+91 98765 43210", "elle@gmail.com",true);

		c1.showCustomer();
		c2.showCustomer();
	}

}
