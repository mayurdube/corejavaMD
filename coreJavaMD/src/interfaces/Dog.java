package interfaces;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Bhooo Bhoo !!");
		
	}

	@Override
	public void play() {
		System.out.println("play with ball");
		
	}

}
