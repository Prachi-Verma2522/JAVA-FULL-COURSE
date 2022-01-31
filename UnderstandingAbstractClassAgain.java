class YoutubeChannel{
	
	String name;
	Notification notification;
	
	YoutubeChannel(){
		name = "BB ki Wines";
	}
	
	void uploadVideo(String videoName) {
		System.out.println("Video Uploaded Successfully !!");
		notification.notifyUser("Video Uploaded: "+videoName);
	}
	
	void sucbsribe(Notification notification) {
		this.notification = notification;
	}
}

abstract class Notification{
	abstract void notifyUser(String message);
}

//here we get parent, child relation
//abstract classes cannot have final keyword only for class but methods with final keyword are possible
//A class cannot extend more than one abstract class if there are multiple abstract classes as multiple inheritance is not supported
// Polymorphic Statement can be implemented i.e. Ref Var of Notification can refere to the User Object
class People extends Notification{ 
	
	String name;
	String email;
	
	People(){
		name = "Tanya";
		email = "tanya@gmail.com";
	}
	
	void notifyUser(String message) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Dear, "+name);
		System.out.println("A New Notification Received");
		System.out.println("Message: "+message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}

public class UnderstandingAbstractClassAgain {

	public static void main(String[] args) {
		
		People uRef = new People();
		
		YoutubeChannel channel = new YoutubeChannel();
		channel.sucbsribe(uRef); // Polymorphic Statment

		channel.uploadVideo("Beta hua Bawala");
	}

}
