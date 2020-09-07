package inheritance;
import java.util.Scanner;


public class Rectangle extends Square{
	int length,breadth,area;
	
	Scanner obj =new Scanner(System.in);
	
	public void area() {
		System.out.println("enter the length of the rectangle");
		length = obj.nextInt();
		
		System.out.println("enter breadth of the rectangle");
		breadth = obj.nextInt();
		
		area = length * breadth;
		System.out.println("area of the rectangle is :" +area);
		
		
	}
       
	

}
