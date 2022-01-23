
public class Loops {

	public static void main(String[] args) {
		// Printing the first row of chessboard
				// 0 -> white
				// 1 -> black
				//Doing the same thing again and again but without any loop condition this makes a simple code long and heavy. Thus, it's
		        // considered as a bad habit.
				char whiteSquare = '\u25A0';
				char blackSquare = '\u25A1';
				
				/*System.out.print(whiteSquare+" "+blackSquare+" ");
				System.out.print(whiteSquare+" "+blackSquare+" ");
				System.out.print(whiteSquare+" "+blackSquare+" ");
				System.out.print(whiteSquare+" "+blackSquare+" ");*/
				
				// Loops or Iterations: When in the code we need to do the same thing n-number of times we use loops.

				
				int idx = 1; // starting point
				//While loop
				// checks condition at entry
				/*while(idx<=4) { // ending point
					System.out.print(whiteSquare+" "+blackSquare+" "); // the statement to be repeated again and again i.e. n number of times
					idx++; // expression with which we will move from starting point to the ending point
				}*/
				
				//do-while loop
				// whenever the condition is wrong, the loop will be executed on a minimum of once :)
				/*do {
					System.out.print(whiteSquare+" "+blackSquare+" ");
					idx++;
				}while(idx<=4); // check condition at exit 
				*/
				
    //for loop
				for(int i=1;i<=4;i++) {
					System.out.print(whiteSquare+" "+blackSquare+" ");
				}
	}
	}
