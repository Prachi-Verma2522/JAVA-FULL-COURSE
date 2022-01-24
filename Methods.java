
public class Methods {
	
	// Why we need a method ?
		// Whenever, we have some piece of code being repeatedly used in our program
		
		// What is a method ?
	   //a block of code/statements used to perform a specific task
	   // only runs when it's called inside the main method
		// Method is a function inside the class
	   // every method must be a part of some class
	
        //SYNTAX: return_type methodName(inputs){....}
		// eg:- void is return type, which means not to return anything
		// printArray1 -> name of the method
		// (int[] array) -> input to be passed to the method
	
	   // Methods are of two types: 1 static- no need to create the object of that class and belongs to a class, memory of static method is fixed 
	// in ram also it cannot access non-static method/variable
	//2 non-static- need to create the object of the class while calling the method, can access static as well as nonstatic method or variables
	//by default a method is non- static
	
		void printArray1(int[] array) { // non-static method
			
			int max = array[0];
			int min = array[0];
			
			for(int element : array) {
				System.out.print(element+" ");
				
				if(element > max) {
					max = element;
				}
				
				if(element < min) {
					min = element;
				}
				
			}
			
			System.out.println();
			System.out.println("Max: "+max+" Min: "+min);
			System.out.println();
			
		}
		
		static void printArray2(int[] array) { // static method
			
			int max = array[0];
			int min = array[0];
			
			for(int element : array) {
				System.out.print(element+" ");
				
				if(element > max) {
					max = element;
				}
				
				if(element < min) {
					min = element;
				}
				
			}
			
			System.out.println();
			System.out.println("Max: "+max+" Min: "+min);
			System.out.println();
			
		}

		
		public static void main(String[] args) {
		
			int[] productPrices = {1200, 3500, 400, 500, 1400, 21600, 2000};
			int[] covidCasesStateWise = {2341, 4635, 84778, 899, 1231, 4411};
			int[] scores = {90, 80, 20, 45, 67, 88, 110, 99, 82, 11, 5};
			
			
			// executing non static method
			Methods refVar = new Methods(); // Object Construction Statement
			refVar.printArray1(productPrices);// will print arrays then in next line max and min value will be printed-> same goes for rest of them
			refVar.printArray1(covidCasesStateWise);
			refVar.printArray1(scores);
			
			// executing the static method
			Methods.printArray2(productPrices);
			Methods.printArray2(covidCasesStateWise);
			Methods.printArray2(scores);
			
			
			// Non Static Methods are executed with Object's Reference
			// Static Methods can be executed by class name
			
			/*int max = productPrices[0];//-> output will be same as of methods
			int min = productPrices[0];
			
			for(int element : productPrices) {
				System.out.print(element+" ");
				
				if(element > max) {
					max = element;
				}
				
				if(element < min) {
					min = element;
				}
				
			}
			
			System.out.println();
			System.out.println("Max: "+max+" Min: "+min);
			System.out.println();
			
			
			max = covidCasesStateWise[0];
			min = covidCasesStateWise[0];
			for(int element : covidCasesStateWise) {
				System.out.print(element+" ");
				
				if(element > max) {
					max = element;
				}
				
				if(element < min) {
					min = element;
				}
			}
			
			System.out.println();
			System.out.println("Max: "+max+" Min: "+min);
			System.out.println();
			
			max = scores[0];
			min = scores[0];
			for(int element : scores) {
				System.out.print(element+" ");
				
				if(element > max) {
					max = element;
				}
				
				if(element < min) {
					min = element;
				}
			}
			
			System.out.println();
			System.out.println("Max: "+max+" Min: "+min);
			System.out.println();*/
			
			int eWallet = 120;//ternary operator
			int cabFare = 200;
			
			String message = (eWallet > cabFare) ? "Cab Booked: updated eWallet: "+(eWallet-cabFare) : "Please Recharge: "+(cabFare - eWallet);
			System.out.println(message);

		}
	}


