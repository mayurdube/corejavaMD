package interfaces;

abstract public class Bank {
    
	
	public Bank() {
	 System.out.println("This ic constructor for bank");
    }
	
	public void display() {
		System.out.println("this is concrete method");
	}
	
	public abstract void rateOfIntrest();
	
}
