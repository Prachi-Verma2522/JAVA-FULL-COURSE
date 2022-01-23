import java.util.Scanner;
public class ConditionalConstructsOla {

	public static void main(String[] args) {
		// we will understand conditional consturcts on the basisof real-time problem
		//here I'm considering OLA application where a user need to book a cab and also able to apply a discount coupon
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current location:");
		String location = sc.nextLine();
		System.out.println("Enter your destination:");
		String destination = sc.nextLine();
		System.out.println("Enter a discount coupon:");
		int coupon = sc.nextInt();
		System.out.println("Enter your amount:");
		int amount = sc.nextInt();
		sc.close();// release the stream and make the memory clear
		System.out.println("Your Current Location is: "+location+" Your destination is: "+destination+" | "+"Coupon " +coupon+" Amount: "+amount);
		
		
		//Coupon codes
		final int OLA = 101;// 50%off for a ride worth >=300
		final int OLAHELLO = 102;// 30% off upto rs 50 for a ride worth>=200
		double discount = 0;
		
		// IF-ELSE
	/*	if (amount>=300) {
			System.out.println("You can apply a coupon code");	
		}
		else {
			System.out.println("You can't apply a coupon code due to a short ride!");
		}
		*/
		
		//IF-ELSE
		/*if(coupon ==OLA && amount >=300) {
			discount = 0.5 * amount;
			System.out.println("Discount is: Rs. "+discount);
			System.out.println("OLA-coupon applied successfully");
		}
		else {
			System.out.println("Invalid coupon code or go for a long ride or choose another destination");
		}*/
		
		//NESTED IF-ELSE
		/*if(coupon == OLAHELLO) {
			if(amount >= 200) {
				discount = 0.3*amount;
				System.out.println("Discount is: "+ discount);
				System.out.println("OLAHELLO applied!");
			}else {
				System.out.println("Amount is lesser. Choose another long ride of Rs." +(200-amount)+" more");
			}
		}else {
			System.out.println("Invalid coupon code");
		}*/
		
		//LADDER IF-ELSE
		if(coupon == OLAHELLO) {
			if(amount >= 200) {
				discount = 0.3*amount;
				if(discount > 50) {
					discount = 50;
				}
				System.out.println("Discount is Rs. "+ discount);
				System.out.println("OLAHELLO-coupon applied successfully!");
			}else {
				System.out.println("Amount is lesser. Choose another long ride of Rs." +(200-amount)+" more");
			}
		}else if(coupon == OLA){
			if(amount >= 300) {
			discount = 0.5 * amount;
			System.out.println("Discount is Rs. "+discount);
			System.out.println("OLA-coupon applied successfully!");
		}else {
			System.out.println("Amount is lesser. Choose another long ride of Rs." +(300-amount)+" more");
		}
		}else {
			System.out.println("Invalid coupon code");
		}

		
	}

}
