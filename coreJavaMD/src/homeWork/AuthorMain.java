package homeWork;

public class AuthorMain {

	public static void main(String[] args) {

		Author obj = new  Author("raju",20, "kondhwa");
		obj.setAuthorName("sam");
		obj.setAge(22);
		obj.setPlace("khed");
		
		System.out.println(obj.getAuthorName() + " is "+obj.getAge()+ " years old , and lives at " +obj.getPlace());

		
		
		
	}

}
