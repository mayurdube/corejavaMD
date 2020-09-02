package inheritance;
import java.util.Scanner;

public class Manager {
String department;
	
	public static void main(String[] args) {
	Worker ob = new  Worker();
	ob.name= "ajay";
	ob.address= "khed";
	ob.age=24;
	ob.phoneNumber=272425;
	ob.salary= 55000;
	
	
	ob.displaySalary();
	
	

}


}
