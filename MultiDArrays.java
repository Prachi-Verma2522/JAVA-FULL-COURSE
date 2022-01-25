public class MultiDArrays {

	public static void main(String[] args) {
		//Creating 1-d array multiple-times 
		int[] dominosIndiaOrders = {63546, 735445, 41324};// of three days
		int[] dominosCanadaOrders = {45464, 62534, 8878};
		int[] dominosDubaiOrders = {8873, 23909, 27534};
		
		// Multi-Dimensional Arrays
		// Array of Arrays -> 2D
		int[][] worldOrders = {
					//     0        1        2
						{63546, 735445, 41324},	// 0
						{45464, 62534, 8878},	// 1	
						{8873, 23904, 27534},		// 2
						{23423, 7878, 7886, 34652, 878},	// 3
						{88123, 32434, 90936, 2635}		// 4
				  };
		
		System.out.println("worldCases is: "+worldOrders);//hashcode of worldOrders
		System.out.println("length of worldCases is: "+worldOrders.length);// length=5
		
		System.out.println();
		
		for(int i=0;i<worldOrders.length;i++) {
			System.out.println("worldOrders["+i+"] is: "+worldOrders[i]);//hashcode 
			System.out.println("length of worldOrders["+i+"] is: "+worldOrders[i].length);// it will return length row-wise
			System.out.println();
		}
		
		// Looping in 2D Array
		for(int i=0;i<worldOrders.length;i++) { // i: 0, 1, 2, 3, 4
			for(int j=0;j<worldOrders[i].length;j++) {
				System.out.print(worldOrders[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// Enhanced For Loop- 2D Arrays
		for(int[] array : worldOrders) {
			for(int element : array) {
				System.out.print(element+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//int[][] array2D = new int[5][4]; // 5- 1d arrays with 4 elements each
		//array2D[1][1] = 1;
		
		int[][] array2D = new int[5][]; // 5: 1-d arrays, but size in each array is not known as of now
		array2D[0] = new int[5]; // 0th array with 5 elements
		array2D[1] = new int[8]; // 1th arrays with 8 elements and same for below
		array2D[2] = new int[12];
		array2D[3] = new int[2];
		array2D[4] = new int[9]; // 4th index array with 9 elements
		
		array2D[1][1] = 1;
		
		for(int[] array : array2D) {
			for(int element : array) {
				System.out.print(element+"  ");
			}
			System.out.println();
		}	
		
		int[][]a, b[];
		
		a = new int[3][3];    // 2d array
		b = new int[5][2][1]; // 3d array 
		
		// 3D Array
		int[][][] array3D = {
								{
									{1, 2, 3},
									{4, 5, 6}
								},
								
								{
									{7, 8, 9},
									{10, 11, 12}
								}
						  };
		
	}

}
