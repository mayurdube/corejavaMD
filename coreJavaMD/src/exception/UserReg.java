package exception;
import java.util.Scanner;

public class UserReg {
	Scanner sc = new Scanner(System.in);
	
	String userName,country;
	int age;
	
	
	
	void registerationProfile() 
	{
		System.out.println("Enter userName: ");
		userName = sc.next();
		
		System.out.println("Enter Country: ");
		country = sc.next();//usa
		
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		

		try {	
			if(country.equalsIgnoreCase("India") == false)
				{
			    	throw new InvalidCountryNameException("Invalid Country");
				}
				else
				{
					System.out.println("User Belongs to India...Congrats");
				}	
		} 
		catch(InvalidCountryNameException e) {
			System.out.println("sorry user not belong to india");
		}
		
				
	
	
	
	
  try {
	  if(age < 18)
	  {
		  throw new InvalidAgeException("Invalid age");
	  }
	  else
	  {
		  System.out.println("User's age is valid");
	  }
  }
  catch(InvalidAgeException e)
  {
	  System.out.println("User is minor");
	  
  }
  
  
  }
	
}
