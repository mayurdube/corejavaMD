package homeWork;
import java.util.Scanner;

/*
 * 2)	Create a class Author with the following:
•	Data Members: authorName,age,place.
•	Constructor with arguments to initialize thevariables. 
iii)Use getter and setter methods to get  & set the values.

 */

public class Author {
	String authorName;
	int age;
	String place;
	
	Scanner inf = new Scanner(System.in);
	
	public Author(String authorName, int age, String Place) {
		this.authorName = authorName;
		this.age = age;
		this.place= place;
		System.out.println(authorName + " is "+age+ " years old , and lives at " +place);
		
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		System.out.println("Enter your name");
		authorName = inf.next();
		this.authorName = authorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("enter your age");
		age = inf.nextInt();
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		System.out.println("where do you live");
		place =inf.next();
		this.place = place;
	}
	
	

}
