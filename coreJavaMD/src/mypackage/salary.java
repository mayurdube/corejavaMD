package mypackage;
import java.util.Scanner;

public class salary {
	
	public void bonus(){
		int oldEmp = 50000;
		int newEmp =30000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Current Working Year In Company : ");
		int year = sc.nextInt();
		 if(year >5) {
			 int bonusSal = oldEmp + 17500;
			 System.out.println("Salary with diwali bonus of 35 % is " +bonusSal);
			 
		 }else {
			 int bonusSal = newEmp + 4500;
			 System.out.println("Salary with diwali bonus of 15% is " +bonusSal);
			 
			 
		 }
		
		
		
		
	}
	
	
	
	

}
