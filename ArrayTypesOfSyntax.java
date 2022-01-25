public class ArrayTypesOfSyntax {

	public static void main(String[] args) {
	 	//1. Implicit Array Creation: compiler will automatically add new int[] on our behalf
				// Syntax-1
				int array1[] = {1, 2, 3, 4, 5};
				
				// Syntax-2
				int[] array2 = {1, 2, 3, 4, 5};
				
	  //2. Explicit Array Creation: where we need to add new int[]
				// Syntax-3
				int array3[] = new int[]{1, 2, 3, 4, 5};
						
				// Syntax-4
				int[] array4 = new int[]{1, 2, 3, 4, 5};
				
				System.out.println("array1 is: "+array1); //  different HashCode
				System.out.println("array2 is: "+array2); // different HashCode
				System.out.println("array3 is: "+array3); // different HashCode
				System.out.println("array4 is: "+array4); // different HashCode
				
				// array1, array2, array3 and array4 are reference variables
				// they will contain the hashcode for array
				
				// Syntax-5
				int a1[], a2; // a1 is reference to an array and a2 is a normal int variable
				int[] a3, a4; // a3 and a4 are both reference to an array
				
				a1 = new int[5];//length=5
				a2 = 100;
				
				a3 = new int[5];//length=5
				a4 = new int[10];//length=10
	
				// for a1, a3 and a4 -> size is on the basis of which array is created with default values as 0
				
				// update data in a4- 1st index
				a4[1] = 9;
				
				for(int element: a4) {
					System.out.print(element+" ");
				}
			}
	}


