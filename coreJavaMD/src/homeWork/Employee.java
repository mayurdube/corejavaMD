package homeWork;
import java.util.Scanner;


/*
 * 1)	Create a class Employee with int id and String name as member variables.
 *  Initialize these variables using getter and setter methods by taking data from the user.
 *   Create object of this class and access these methods from the main method of another class. 
 *   Also provide different values to observe the changes
 */

public class Employee {
	
	int id;
	String name;
	
	Scanner info  = new Scanner(System.in);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println(" What your id ?");
		id = info.nextInt();
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("whats ur name ?");
		name = info.next();
		this.name = name;
	}
	
	

}
