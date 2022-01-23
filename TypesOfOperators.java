/*
 	VIEW: Console Based i.e. Textual Command Line
 		  GUI based
 	CONTROLLER:logic
 			    1. Operators
 			    2. Conditional Constructs if/else or switch case/nested if-else
 			    3. Loops or iterations-for loop/nested loops/while/do-while
 */

public class TypesOfOperators {

	public static void main(String[] args) {
		
		// Operators help to perform computation
		// 1. Arithmetic Operators
		//    +, -, *, /, %
		double amount = 1200.58;
		double tax = 0.18;
		
		double total = amount + (tax*amount);
		System.out.println("Total is: "+total);
		
		int number = 6;
		int buckets = 3;
		int hashCode = number % buckets;// %-mod: gives remainder
		System.out.println("HashCode is: "+hashCode);
		
		// 2. Assignment Operators
		// =, +=, -=. *=, /=, %=
		int eWallet = 200; // = -> assignment operator copies the data
		eWallet += 100; // -> which is same as: eWallet = eWallet + 100;
		System.out.println("eWallet now is: "+eWallet);
		
		eWallet %= 7;
		System.out.println("eWallet is: "+eWallet);
		
		// 3. Increment and Decrement Operators -> increment or decrement the value by 1
		int quantity = 1;
		quantity++; // postfix//2[1+1]
		++quantity; // prefix//3[2+1]
		
		quantity--;//2[3-1]
		
		System.out.println("Quantity is: "+quantity); // 2
		
		//int value = quantity++; // getting the previous value//3
	     int value = ++quantity; // getting the latest value//2
		System.out.println("value: "+value+" and quantity: "+quantity);
		
		// Conditional/Relational Operators
		// >, <, >=, <=, ==, !=
		
		eWallet = 300;
		int cabFare = 300;
		
		System.out.println("Can i Book a Cab: "+(eWallet >= cabFare));
		
		boolean gps = true;
		System.out.println("Is gps not enabled: "+!gps);
		
		int promoCode = 1201;
		int promoCodeEnteredByUser = 1202;
		
		System.out.println("Can i get a Discount: "+(promoCode == promoCodeEnteredByUser));
		
		// Logical Operators
		// &&, !!, !
		
		System.out.println("Can i book a cab and get discount: "+( (eWallet >= cabFare) && (promoCode == promoCodeEnteredByUser) ));
		System.out.println("Can i book a cab and get discount: "+( (eWallet >= cabFare) || (promoCode == promoCodeEnteredByUser) ));
		
		// Bitwise Operators
		// &(AND), |(OR), ^(XOR)
		int num1 = 10;				// 1 0 1 0
		int num2 = 8;   			// 1 0 0 0
		
		int result1 = num1 & num2;	// 1 0 0 0	-> 8->both 1 then result will be 1 otherwise 0
		int result2 = num1 | num2;	// 1 0 1 0	-> 10->both 0 then result is 0 or both 1 then result is 1, otherwise diff then result would be 1
		int result3 = num1 ^ num2;  // 0 0 1 0	-> 2->same digits then result would be 0 otherwise it's 1
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		
		
		// Shift Operators :)
		// >>, <<, >>>
		
		int x = 8;			// 0 0 0 0  1 0 0 0
		int y = 3;			// right shift by 3
		int z = x >> y;		// 8>>3
							// _ _ _ 0  0 0 0 1  => 0 0 0 0  0 0 0 1 => 1
		
		// shortcut: divide 8 with 2 power 3 -> i.e. 8/8 -> 1
		System.out.println("z is: "+z);
		
		x = 11;				// 0 0 0 0  1 0 1 1
		y = 3;	
		z = x >> y;			// _ _ _ 0  0 0 0 1 => 0 0 0 0  0 0 0 1
							// 11/8 -> 1
		System.out.println("z now is: "+z);  // 1
		
		/*
		 	11
		 	0 0 0 0  1 0 1 1
		 	
		 	1 1 1 1  0 1 0 0
		 				 + 1
		 	-11			   
		 	1 1 1 1  0 1 0 1
		 	>> 3
		 	_ _ _ 1  1 1 1 0
		 	1 1 1 1  1 1 1 0
		 	
		 	0 0 0 0  0 0 0 1
		 				 + 1
		 	0 0 0 0  0 0 1 0 -> -2			 
		 */
		
		x = -13;
		y = 3;
		z = x >> y;
		System.out.println("z now is: "+z);
		
		x = 8;
		y = 3;
		z = x << y;//left shift by 3
		// multiply 8 with 2 power 3 -> i.e. 8*8 -> 64
		// 0 0 0 0  1 0 0 0 
		// << 3
		// 0 1 0 0  0 _ _ _
		// 0 1 0 0  0 0 0 0 -> 64 :)
		
		
		System.out.println("z with left shift is: "+z);
		// Ternary Operator
		eWallet -= 200;
		String message = (eWallet >= cabFare) ? "Cab is Booked" : "Please recharge your wallet";
		System.out.println(message);
				
	}

}

