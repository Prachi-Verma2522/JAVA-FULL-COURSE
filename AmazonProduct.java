class Product{
	String productName;
	int productPrice;
	String brand;
	
	Product(){
		productName = "";
		productPrice = 50;
		brand = "";
	}
	
	/*Product( String productName, int productPrice, String brand){
		this.productName = productName;
		this.productPrice = productPrice;
		this.brand = brand;
	}*/
	 
	void show() {
		System.out.println("Product details:");
		System.out.println("----------------------------------------------------");
		System.out.println("Name of the product:- " + productName);
		System.out.println("Price of the product:- "+productPrice);
		System.out.println("Brand name of the product:-"+brand);
		System.out.println("----------------------------------------------------");	
	}
	
	void setProductName(String proName) {
		if(proName.length()>2) {
			productName = proName;
		}else {
			System.out.println("Enter a valid product name!");
		}	
	}
	String getProductName() {
		return productName;
	}
	void setProductPrice( int proPrice) {
		if(proPrice!=0) {
			productPrice = proPrice;
			//System.out.println("Enter a vaild price of the product!");
		}else {
			//productPrice = proPrice;
			System.out.println("Enter a vaild price of the product!");
		}
	}
	int getProductPrice() {
		return productPrice;
	}
	void setBrand(String brandName) {
		if (brandName.length()>3) {
			brand = brandName;
		}else {
			System.out.println("Enter a valid brand name!");
		}
	}
	String getBrand() {
		return brand;
	}	
}

 public class AmazonProduct {

	 public static void main(String[] args) {
		Product prodct = new Product();
		
		prodct.setProductName("Iphone 13");
		prodct.setProductPrice(870000);
		prodct.setBrand("Apple");
		prodct.show();
	}

}
