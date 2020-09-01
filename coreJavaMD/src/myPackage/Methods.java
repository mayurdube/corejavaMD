package myPackage;
import java.util.Scanner;

public class Methods {
	
	
		public void start() {
		System.out.println("WELCOME!!");
		System.out.println("Press 1  To Add Two Numbers");
		System.out.println("Press 2  To Subtarct Two Numbers");
		System.out.println("Press 3  To Multiply Two Numbers");
		System.out.println("Press 3  To Divide Two Numbers");
		}
	

		
		public void addition(int num1 ,int num2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter NUM 1 :");
			num1 = sc.nextInt();
			System.out.println("Enter NUM 2 :");
			num2 = sc.nextInt();
			
			  
			int result;
			result = num1 +num2;
			System.out.println("Addition Of Given Two Numbers Is "+result);
			
			
		}
		
		public void subtract (int num1,int num2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter NUM 1 :");
			num1 = sc.nextInt();
			System.out.println("Enter NUM 2 :");
			num2 = sc.nextInt();
			
			int result;
			result = num1 -num2;
			System.out.println("Subtraction Of Given Two Numbers Is "+result);
			
			
		}
		
		public void multiply (int num1 ,int num2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter NUM 1 :");
			num1 = sc.nextInt();
			System.out.println("Enter NUM 2 :");
			num2 = sc.nextInt();
			
			int result;
			result = num1 * num2;
			System.out.println("Multiplication Of Given Two Numbers Is "+result);
		}
		
		public void divide (int num1 ,int num2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter NUM 1 :");
			num1 = sc.nextInt();
			System.out.println("Enter NUM 2 :");
			num2 = sc.nextInt();
			
			int result;
			result = num1 / num2;
			System.out.println("Division Of Given Two Numbers Is "+result);
		}
			
			
			
			
		
		
		
		
		
	

}
