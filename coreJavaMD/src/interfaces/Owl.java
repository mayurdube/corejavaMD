package interfaces;

public class Owl implements Animal3 {

	@Override
	public void makeSound() {
		System.out.println("Gurrr!");
		
	}

	@Override
	public void play() {
		System.out.println("play in air");
		
	}

	@Override
	public void run() {
		System.out.println("can also run");
		
	}

	@Override
	public void drink() {
		System.out.println("drinks water");
		
	}

}
