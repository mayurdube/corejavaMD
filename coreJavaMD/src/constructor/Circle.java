package constructor;
import java.util.Scanner;

public class Circle {
	
	
	Scanner val = new Scanner(System.in);
	float pi = 3.14f;
	int radius;
	
	
	void areaOfCircle(int radius) {
		System.out.println("Enter Value Of radius :");
		this.radius=radius = val.nextInt();
		int area = (int) ( pi * radius * radius);
		System.out.println("area of circle is : "+ area);
	} 
	 
	void circumference(int radius) {
		System.out.println("Enter Value Of radius :");
		this.radius=radius = val.nextInt();
		int circumference = (int) (2 * pi * radius);
		System.out.println("circumference of circle is : "+ circumference);
	}
	
	

}
