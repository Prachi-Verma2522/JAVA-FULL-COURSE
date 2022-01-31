class MyProfile{
	String name;
	String email;
	String phoneNumber;
	char gender;
	
	MyProfile(){
		name = "Tanya";
		email = "tanya@gmail.com";
	    phoneNumber = "+91 12 12 334 23";
	    gender = 'F';	
	}
	 void show() {
		 System.out.println("--------------------------------------------------------");
		 System.out.println("User Name: "+ name+"Email Id: "+email+"Phone Number: "+phoneNumber+"Gender: "+gender);
		 System.out.println("--------------------------------------------------------");
	 }
}
	 
class FlightBooking extends MyProfile{
	String sourceLocation;
	String destinationLocation;
	String dateOfJourney;
	int numOfTravellers;
	String returningDate;
	
	FlightBooking(){
		sourceLocation = "Lucknow";
		destinationLocation = "Canada";
		dateOfJourney = "15th May, 2022";
		numOfTravellers = 1;
		returningDate = "5 Jan, 2023";	
	}
       void show() {
    	 System.out.println("--------------------------------------------------------");
    	 super.show();
		 System.out.println("Source Loaction: "+ sourceLocation+ "Destination Location: "+ destinationLocation+"Date Of Journey: "+ dateOfJourney+"\n"+
				 "Number Of Travellers: "+ numOfTravellers+"Returning Date: "+ returningDate);
		 System.out.println("--------------------------------------------------------");	 
     }	
}
class Airlines extends FlightBooking{
	String flightType;
	
	Airlines(){
		flightType = "Air India";	
	}
       void show() {
    	   System.out.println("--------------------------------------------------------");
      	 super.show();
  		 System.out.println("Type of Airline: "+flightType);
  		 System.out.println("--------------------------------------------------------");	    
       }	
}
public class MMT {

	public static void main(String[] args) {
		//MyProfile profile = new MyProfile("Tanya","tanya@gmail.com","+91 122331 433",'F');
		MyProfile profile = new MyProfile();
		profile.show();
	   Airlines air = new Airlines();
	   air.show();
	}

}
