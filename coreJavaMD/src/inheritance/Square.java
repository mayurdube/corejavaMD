package inheritance;
import java.util.Scanner;




/*
 * 1. Define a class named Square as shown below:
i)	Data Member: side
ii)	Methods: area()
 iii)Constructor.
iv)	Define another class Rectangle that extends class Square
a.	Data Member: length,breadth
b.	Constructor.
c.	Methods: area()
v)	Define one more class named Triangle that extends the class Rectangle
a.	Data Member: side1,side2,side3
b.	Constructor
c.	Methods: area()
vi)	Create objects for the classes Square,rectangle and Triangle.Test them.

 */

public class Square {
	int side,area;
	
	public Square() {
		//constructor
	}
	
	
	Scanner obj = new Scanner(System.in);
	public void area(int side ) { //method
		System.out.println("enter the side of square :");
		side = obj.nextInt();
		
		area = side * side;
		System.out.println("area of the square is :"+area);
		
		
	}

	

}
