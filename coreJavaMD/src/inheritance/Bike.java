package inheritance;

public class Bike extends Vehicle {
	int discountRate = 10/100;
	int vehiclePrice = 80000;
   
	void discount() { // discount method
		int discountPrice = vehiclePrice - 8000;
		System.out.println("price on discount is :"+ discountPrice);
	 }
	
	public Bike(){
		//constructor
	}
 
 

	public static void main(String[] args) {
		Vehicle ob = new Vehicle();
		ob.vehicleName = "Honda Shine 125cc";
		ob.serviceStationName = "rohan honda pune";
		ob.vehicleModelNumber = 101234;
		ob.vehiclePrice = 80000;
		
		ob.display();
		
		Bike ob1 = new Bike();
		ob1.discount();
		
	

	}

}
