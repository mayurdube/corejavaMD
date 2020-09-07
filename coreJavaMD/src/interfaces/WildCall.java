package interfaces;

public class WildCall {

	public static void main(String[] args) {
		WildAnimals object = new WildAnimals();
		object.setAnimal1("tiger");
		object.setAnimal2("Lion");
		
		System.out.println("the given wild animals are :" +object.getAnimal1() + " & "+ object.getAnimal2());
     
	}

}
