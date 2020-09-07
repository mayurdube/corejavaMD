package inheritance;
import java.util.Scanner;

public class Vehicle {
/*
 * 2)	Define a class named Vehicle as described below:
i)	Data Members:
a.	vehicle name
b.	vehicle model number
c.	vehicle price
d.	service station name
ii)	Methods:
a.	Constructor
b.	Display() method to display all the details of class Vehicle .
iii)	Define another class named Bike that extends the class Vehicle.
a.	Data Members: discountRate
b.	Constructor
c.	Methods:display() to display bike name,bike model number,bike price,service station name,discount rate.
iv)	Discount() method to compute the discount.
v)	Create an object for the class Bike and test it.

 */
	
	String vehicleName, serviceStationName;
	int vehicleModelNumber, vehiclePrice;
	 
	
	Scanner ob = new Scanner(System.in);
	public void input() {
		System.out.println("what is the name of vehicle :");
		vehicleName = ob.next();
		
		System.out.println("service station name :");
		serviceStationName = ob.next();
		
		System.out.println("model no of vehicle");
		vehicleModelNumber = ob.nextInt();
		
		System.out.println("price of vehicle");
		vehiclePrice = ob.nextInt();
		
	}
	
	 
	public Vehicle() { //constructor
		
	}
	
	public void display() {
		System.out.println("the name of the vehicle is :" +vehicleName);
		System.out.println("vehicle model number is :" +vehicleModelNumber);
		System.out.println("Service station of this vehicle is :"+serviceStationName);
		System.out.println("the price of the vehicle is :" + vehiclePrice);
	}
	
	
	
	
	
}
