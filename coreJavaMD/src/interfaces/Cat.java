package interfaces;

public class Cat implements Animal , Animal2{

	@Override
	public void makeSound() {
		System.out.println("Meow !!");
		
	}

	@Override
	public void play() {
		System.out.println("play with hand");
		
	}

	@Override
	public void eat() {
		System.out.println("eats all the time");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep for long time");
		
	}



}
