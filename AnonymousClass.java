
/*abstract class Notification{
abstract void notifyUser();
abstract void sayHello(String name);
}*/

interface Channel{
void notifyUser();
void sayHello(String name);
}

/*class SuperAdminUser implements Notification{
public void notifyUser() {
	System.out.println("A new notification received");
}
}*/


public class AnonymousClass {

public static void main(String[] args) {
	
	//SuperAdminUser user = new SuperAdminUser(); // Direct Object Construction
	// user.notifyUser();
	
	// Polymorphic Statement
	//Notification notifcation = new SuperAdminUser();
	//notifcation.notifyUser();
	
	// Anonymous class:-
	// 1.When we wish to have a single object for a class which implements interface
	//2. It's purpose is just for instant usage
	//3.one-time usage
	//4.name-less class
	Channel notification = new Channel() {
		public void notifyUser() {
			System.out.println("A new notification received");
		}
		public void sayHello(String name) {
			System.out.println("Hello, "+name);
		}	
	};
	// Create an anonymous class, then create the object of anonymous class and return the hashcode to the reference variable
	System.out.println("notification is: "+notification);
	notification.notifyUser();
	notification.sayHello("Tanya");

}

}
