import java.util.Arrays;
public class ArrayOrImageRotation {
	
	public static void main(String[] args) {
		
		int arr[][] = { 
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		//rotating the array by 90 degrees

		for(int i = 0; i<arr.length; i++) {//row
			for(int j = i; j<arr[0].length; j++) {
				int temp = 0;    // transposing the array
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;	
			}
			}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length/2; j++) {
				int temp = 0;   // two pointer method to reverse every row
				temp = arr[i][j];
				arr[i][j] = arr[i][arr.length-1-j];
				arr[i][arr.length-1-j] = temp;
			}
		}

		System.out.println("Array after rotation is:");
		System.out.println();
	
		for(int[] matrix:arr) // printing the array
				System.out.println(Arrays.toString(matrix));
			}
		}
		


	

