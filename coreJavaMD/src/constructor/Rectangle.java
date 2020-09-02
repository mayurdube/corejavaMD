package constructor;

public class Rectangle {
	int length , breadth, area;
	
	void area(){
		area = length * breadth;
		
	}
	
	void display() {
		area();
		System.out.println("area of the rectangle is "+area);
	}

	
	public Rectangle() {
		length = 0;
		breadth = 0;
		
		area();
		display();
		
		
		
		
	}
	
	public Rectangle (int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
		area();
		display();
	}
	
	public Rectangle (int number) {
		this.breadth =number;
		this.length = number;
		
		area();
		display();
		
	}
	
	
}
