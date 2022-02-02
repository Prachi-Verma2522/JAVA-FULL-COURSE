public class Blocks {
public class Blocks{	
	String currentLocation;
	String sourceLocation;
	String destinationLocation;

	Blocks(){
		System.out.println("3. Block Constructor");
		
		if(currentLocation.equals("delhi")) {
			sourceLocation = "delhi";
			destinationLocation = "bangalore";
		}else if(currentLocation.equals("bangalore")) {
			sourceLocation = "bangalore";
			destinationLocation = "delhi";
		}else {
			sourceLocation = "mumbai";
			destinationLocation = "chennai";
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("1. main");
		Blocks bRef = new Blocks();
		System.out.println("bRef data: "+bRef);

	}
	
	// Create initialization block
	// Pre-Processing of Data
	{
		System.out.println("2. Initialization Block");
		currentLocation = "mumbai";
	}

	@Override
	public String toString() {
		return "Blocks [currentLocation=" + currentLocation + ", sourceLocation=" + sourceLocation
				+ ", destinitionLocation=" + destinationLocation + "]";
	}
	
	// In order to initialize something before program starts :)
	static {
		System.out.println("0. Static Block");
	}
	
	

}
