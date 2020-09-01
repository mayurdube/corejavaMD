package myPackage;

import java.util.Scanner;


public class Equilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		Scanner side = new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		a = side.nextInt();
		
		if(a >=1 ) {
			System.out.println("the no is positive");
		}else if (a == 0) {System.out.println("the no is zero");
		}else {System.out.println("the no is negative");}
		
		
		
		

		

	

	}

}
