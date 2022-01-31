
class CA{
	
}

//1.  Single Level Inheritance -> subclass/child class inherit one(parent) class
class CB extends CA{
	
}

//2. Multi-Level Inheritance -> a derived class will be inheriting a base class and as well as derived class also act as base class to other class
class CC extends CB{
	
}

class CD{
	
}

//3. Multiple Inheritance -> Not Supported and Not Required but possible through interfaces
/*class CE extends CA, CD{
	
}*/

//4. Hierarchy -> CA has 2 children CB and CF, one class serves as a base class for more than one subclass
class CF extends CA{
	
}

// Hybrid -> combination of above all and achieved through interfaces

public class TypesOfInheritance {

	public static void main(String[] args) {
		
		
	}

}
