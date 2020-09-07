package inheritance;
import java.util.Scanner;


public class Worker {
	/*
	 * 1)	Create a class named ‘Worker’ having the following members:
	 *  Sname, Sage, Sphone number ,Saddress, Ssalary.It also has a method named 'displaySalary'
	 *   which displays the salary of the members. Two classes 'Employee' and 'Manager' inherit the ‘Worker’ class. 
	 *   The 'Employee' and 'Manager' classes have data members 'Work specialization' and 'department' respectively. 
	 *   Now, assign name, age, phone number, address and salary to an employee and
	 *    a manager by making an object of both of these classes and print the same.
	 */
	
	String name;
	int age;
	long phoneNumber;
	String address;
	int salary;
	
	Scanner info = new Scanner(System.in);
	
	public void input() {
		System.out.println("enter your name :");
		name = info.next();
		
		System.out.println("whats your age ?");
		age =info.nextInt();
		
		System.out.println("enter your contact number :");
		phoneNumber = info.nextLong();
		
		System.out.println("enter your address :");
		address = info.next();
		
		System.out.println("enter your salary :");
		salary = info.nextInt();
	}
	
	void displaySalary() {
		System.out.println("name of the worker is :"+name);
		System.out.println("address of the worker is :"+address);
		System.out.println("age of the worker is :"+age);
		System.out.println("contact no of the worker is :"+phoneNumber);
		System.out.println("Workers Salary is :" + salary);
		
		 
	 }
	

	
	

}
