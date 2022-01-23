import java.util.Scanner;
public class ConsoleView {

	public static void main(String[] args) {
		//Scanner: is a utility class, built in java program to read data from the console/output screen into the program
		System.out.println("Please enter all the details correctly");
		//creating the scanner object and passing input stream into it
		Scanner sc = new Scanner(System.in);//reads the data from console and let scanner process it
		System.out.println("Your Name:");
		String name = sc.nextLine();// this is to read string
		System.out.println("Your Age:");
		int age = sc.nextInt();//to read int
		System.out.println("Your Salary:");
		double salary = sc.nextDouble();
		//Note: with scanner we must read string before the numbers and in case if we wish do then just do an empty nextLine();
		sc.nextLine();
		System.out.println("Are you willing to do a part-time job?");
		boolean agreement = sc.nextBoolean();
		System.out.println("A warm welcome to our company " +name+ " you're perfect for this job as you are "+age+" your current salary is-"+salary
				+" Are you excited? " +agreement);
		
		sc.close();//to release the memory resources after usage
		
		
		
		
		

	}

}
