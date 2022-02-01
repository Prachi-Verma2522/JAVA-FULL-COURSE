

//Functional Interface:
//An interface with just 1 single abstract method

@FunctionalInterface
interface Taxes{
	double computeTaxes(int amount);
	
	default void hey() {
		System.out.println("Hello");
	}
	
	static void woah() {
		System.out.println("woahh");
	}
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
		// Anonymous Class
		/*Taxes refVar = new Taxes() {
			public double computeTaxes(int amount) {
				return amount*0.18;
			}
		};
		*/
		
		// Lambda Expression: works only for functional interfaces :)
		/*Taxes refVar = (int amount) -> {
			return amount*0.18;
		};*/
		
		// ignore data type for inputs
		/*Taxes refVar = (amount) -> {
			return amount*0.18;
		};*/
		
		Taxes refVar = (amount) -> amount<=1000 ? amount*0.20 : amount*0.23;
		
		System.out.println("Taxes on 1000 are: "+refVar.computeTaxes(900));
		System.out.println("Taxes on 2000 are: "+refVar.computeTaxes(2100));
		
		refVar.hey();
		Taxes.woah();
	}
}
