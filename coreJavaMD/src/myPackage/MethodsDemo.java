package myPackage;
import java.util.Scanner;

public class MethodsDemo {

	public static void main(String[] args) {
		
		Methods object = new Methods();
		object.start();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Your Choice :");
		int choice = sc.nextInt();
		
		
		  
		if (choice == 1) {
			object.addition(50, 30);
			object.start();
		}else if (choice == 2) {
			object.subtract(50, 30);
			object.start();
		}else if (choice == 3) {
			object.multiply(5, 2);
			object.start();
		}else if (choice == 4) {
			object.divide(10, 2);
			object.start();
		}
		
		
		
		
		
		
		
		

		
		
		
		
	}

}
