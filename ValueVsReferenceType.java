public class ValueVsReferenceType {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a; // Value Copy from a to b; b=10
		
		b += 5; // increment b by 5->b=15
		
		System.out.println("a is: "+a);//10
		System.out.println("b is: "+b);//15
		
		// Here a and b are different storage containers with different hashcodes in stack of type primitive
		
		int[] a1 = {1, 2, 3, 4, 5};
		System.out.println("a1 is: "+a1);// a1 is: [I@3fee733d ;it will print the hashcode of a1
		
		int[] a2 = a1; // Reference Copying// type->reference
		System.out.println("a2 is: "+a2);// a2 is: [I@3fee733d ;same hashcode will be printed as that of a1
		
		// a1 and a2 are different reference variables, but they hold the same hashcode :)
		// Hence, we have only 1 array in the Heap which is shared by 2 references a1 and a2
		
		// Let a2 modify the 2nd index in array
		a2[2] = 9;

		// reading the entire a1
		System.out.println("a1 contents are: ");
		for(int element: a1) {
			System.out.print(element+"  ");// 1 2 9 4 5
		}
		
		System.out.println();
		
		for(int idx=0;idx<a1.length;idx++) {
			a1[idx] = a1[idx] * a1[idx];//squaring the elements of a1
		}
		System.out.println();
		
		System.out.println("a1 contents are: ");
		for(int element: a1) {
			System.out.print(element+"  ");// 1 4 81 16 25
		}
		
		System.out.println();
		
		System.out.println("a2 contents are: ");
		for(int element: a2) {
			System.out.print(element+"  ");// 1 4 81 16 25
		}
		

	}

}
