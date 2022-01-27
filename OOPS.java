
/*
	
	OOPS -> Object Oriented Programming Structure 
     ->	it emphasize on Object
			1. Object
			2. Class
			
		 ~ In Real World
			->	Object: anything which is existing in reality e.g.- a chair, house, table, humans.
			->	Class : drawing (blueprint) of an object e.g.- blueprint of a house
				
		~	Computer Science (world of programming)
				Object: is a storage container i.e. a multi -value container
					->	we see object as a box
					->	it can be homogeneous or hetrogeneous
					->	they are reference type
				Class: is a textual representation of object
						i.e. we code the object as class
						
  	 ~  Principle of OOPS:-
			1. Think of an object
			2. Create its class
			3. From the class create the real object in memory			
			
			
			1. Think of an object
			Que. How can we think of object ?
			Ans. pickup the objects from the software requirement sheet. i.e. the problem statement will help us in identifying the objects
		->	Objects will be those, who contains lot of data associated with them.
	(Problem Statement)	Requirement: Create a Food Delivery App where a User can register. User should be able to see the list of restaurants along with their Dishes. User can place an Order from Restaurant.
			Delivery Agent will pickup the Order from restaurant and deliver it to the User Address.
	
			1. Think of an object
				User: name, phone, email, gender, addressLine, city, state, zipCode, etc
				Restaurant: name, phone, email, image, operatingHours, ratings, reviews, etc
				Dish: name, price, description, image, quantity, reviews, etc
				
				Object: User, Restaurant, Dish and User
				Attributes: name, phone, email, gender, addressLine, city, state, zipCode( and same for restaurant, dish)
				
	
*/

//2. Create its class
class User{ // representation of a User Object: whatever we code in class belongs to object
// Attributes: Created inside the class, but they are in actual for the object,  attributes are the property of  an object
String name;
String phone;
String email;
char gender;
String addressLine;
String city;
String state;
int zipCode;
}
class OOPS {

public static void main(String[] args) {
	
	// 3. From the class create the real object in memory
	User uRef1 = new User(); // new User(); -> creates an object at runtime in the heap area of memory
	User uRef2 = new User();
	User uRef3 = uRef1; // Reference Copy Operation
	// uRef1 and uRef3 belongs to one object and have the same hash code
	
	System.out.println("uRef1 is: "+uRef1);//User@1c655221->hash code
	System.out.println("uRef2 is: "+uRef2);//User@ee7d9f1
	System.out.println("uRef3 is: "+uRef3);//User@1c655221

	System.out.println();
	
	// PS: uRef1, uRef2 and uRef3 are NOT Objects; User is an object
	// They are reference variables which holds the hashcode of the object
	
	// Operations on Object
	// 1. Add Data into Object i.e. set the initial value for attributes in object
	uRef1.name = "Helly Teffin";
	uRef1.email = "helly@gmail.com";
	uRef3.phone = "+91 99999 0001";
	uRef3.addressLine = "NY lines";
	uRef1.zipCode = 141002;
	
	uRef2.name = "Tessa Young";
	uRef2.email = "tessa@gmailcom";
	uRef2.phone = "+91 901212 098";
	uRef2.addressLine = "Toronto walk";
	uRef2.zipCode = 141025;
	
	// 2. Update Data into Object i.e. set the new value for attributes in object
	uRef2.phone = "+91 98765 43110";
	
	// 3. Read data from Object i.e. use sout statement
	
	System.out.println("uRef1 Details ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println(uRef1.name+" can be called on "+uRef1.phone+" and lives in "+uRef1.addressLine);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println();
	
	System.out.println("uRef2 Details- ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println(uRef2.name+" can be called on "+uRef2.phone+" and lives in "+uRef2.addressLine);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println();
	
	System.out.println("uRef3 Details- ");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println(uRef3.name+" can be called on "+uRef3.phone+" and lives in "+uRef3.addressLine);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println();
	
	// 4. Remove data from Object -> not possible, we can get the entire object deleted by GC
	//System.gc();
}	
}

