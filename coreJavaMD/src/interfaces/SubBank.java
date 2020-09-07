package interfaces;

public class SubBank extends Bank {

	public SubBank() {
		System.out.println("this is constructor for subbank");
	}
	
	
	public void returnIntrest() {
		System.out.println("10 % return intrest");
	}

	@Override
	public void rateOfIntrest() {
		System.out.println("rate of intrest is 12 %");
		
	}
	
}
