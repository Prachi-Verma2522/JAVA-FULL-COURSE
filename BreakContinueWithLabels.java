
public class BreakContinueWithLables {

	public static void main(String[] args) {
		//Break: 1.It's a loop control statement
		  /*       2.used to terminate the loop
		         3.if we omit break, execution will continue into the next loop */
    
     //Continue: 1.it breaks one iteration(in loop), if a specified condition occurs then it will skip that condition and continue with next iteration
	//	in loop
		 //2. Control statement
    
				int myDominosOrder = 7;
				for(int dominosOrder=1; dominosOrder<=14; dominosOrder++) {
					System.out.println("Your Order Is Ready to Take:"+dominosOrder);
					if(dominosOrder == myDominosOrder) {
						System.out.println("My Pizza is ready to eat :)");
						break; // to terminate the loop :)
					}	
				}
    
				System.out.println();
    
				int absentStudent = 8;
				for(int student=1; student<=10; student++) {
					if(absentStudent == student) {
						System.out.println("This student is absent!");
						continue; // skips the specified statement and moves the loop into next iteration
					}
					System.out.println("Lets Start the Attendance: "+student);	
				}
    
    // Labels: 1. Control statement
		//     2. with a mandatory condition that within the loop, the label can only be used once with break and continue keyword
		//     3. Label is used to come out of the outer loop
		//     4. Break is used to come out of the inner loop
				myOrder: //label to the loop
					for(int i=1; i<=5; i++) {
						System.out.println("i is: "+i);
						for(int j=1; j<=10; j++) {
							System.out.print(j+" ");
							if(j==6) {
								break myOrder;
							}
						}
					}
					
	}

}
