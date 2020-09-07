package inheritance;
import java.util.Scanner;

public class Employee extends  Worker {
	 String workSpecialization =" head employee";
	
	public static void main(String[] args) {
		Worker ob = new  Worker();
//		ob.address = "Pune";
//		ob.name = "bob";
//		ob.age =23;
//		ob.salary= 35000;
//		ob.phoneNumber = 272424;
		
		ob.input();
		ob.displaySalary();
//		System.out.println("work specialization is :"+workSpecialization);
		
		
		
	
	
	
	
	
	}

}
