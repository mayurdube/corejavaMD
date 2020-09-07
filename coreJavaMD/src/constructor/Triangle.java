package constructor;
import java.util.Scanner;

public class Triangle extends Rectangle{
	 
	 int side1,side2,side3,areaTriangle;
	 Scanner obj = new Scanner(System.in);
	 
	 public void areaTriangle() {
		 System.out.println("enter the side1 :");
		 side1 = obj.nextInt();
		 System.out.println("enter the side2 :");
		 side2 = obj.nextInt();
		 System.out.println("enter the side3 :");
		 side3 = obj.nextInt();
		 
		 areaTriangle = side1 *side2* side3 ;
		 System.out.println("area of the triangle is :"+areaTriangle);
		 
		
	 
	 
	
		
		
	}
    
    
}
