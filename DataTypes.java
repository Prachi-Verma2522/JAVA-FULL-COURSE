
	/*  Java has a MVC architecture; M-model, V-view, C-controller
	 * 	MODEL :it deals with the data, Storage Container
 			1. Single Value Container -Primitive Types:
 					a.Integral :byte 8 bits,short 16 bits, int	32 bits, long 64 bits
 						
 					b.Floating Point:float 32 bits and double	64 bits
 					
 					c.Character: char 16 bits
 						
 					d. Logical: boolean	8 bits and out of 8 bits only 1 bit is used/considered
 				
 			2. Multi- Value Container- Reference type- Data Structures
 				2.1 Homogeneous: Arrays and objects
 					
 				2.2 Heterogeneous: objects
 */
	// execution of the java program begins from the main method
   public class DataTypes{
	public static void main(String[] args) {
		
		// 1. Creating a Single Value Storage Container
		byte age = 20; 
		// age is the name of storage container- also known as variable 
		// byte is the type of storage container/data type
		//  1. can store only integer data
		//  2. size is 8 bits i.e. 2 power 8 -> 256 |256/2 Range -128 to 0 to 127
		// 20 is the data in container. it is constant | or known as literal
		// = operator provides the value to the container i.e. copy the data in container

		// 20 literal which is in constant pool of 32 bits
		// is copied into age which is of 8 bits
		// This copy from a larger container to a smaller container is known as  DownCasting
		// Here Compiler automatically performs this operation
		
		//2. Update the value of age i.e. update the storage container
		//age = 35;
		
		//3. Read the Storage container
		System.out.println("age is: "+age);
		
		//age = 128; // now 128 is not accommodate in 8 bits of space -> which shows error
		
		// s is 16 bits but 200 is 32 bits
		short s = 200; // 16 bits of storage
		
		int eWallet = 300; // int is 32 bits of storage
		
		// long -> 64 bits
		// 9090910101 -> 32bits and hence an error because 10 digit number cannot be accommodated in 32 bits
		long phoneNumber = 9090910101L;
		
		// Upcasting 
		int num1 = 200;
		long num2 = num1; // Copy Operation -> UPCASTING i.e. we are copying 32 bits into 64 bits :)
		
		// Downcasting
		//int num3 = num2; // error -> as we are copying 64bits into 32 bits
		int num3 = (int)num2; // Put a cast and we can now copy the data
		// But, in above situation possible loss of data can occur
		
		// Floating Points
		//float percentage = 75.7;
		// floating point literals will be saved in 64 bits memory i.e. 75.7 in constant pool will be 64 bits
		
		float percentage = 75.7F; // f in the end will make literal to be stored in 32 bits
		System.out.println("s:"+s+"eWallet:"+eWallet+"Phone Number:"+phoneNumber+"num1:"+num1+"num2:"+num2+"num3"+num3+"percentage:"+percentage);
	}

}
