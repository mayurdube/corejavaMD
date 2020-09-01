package myPackage;

public class Compound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p =2000;
		int t = 5;
		double r=0.08;
		int n=12;
		
		double ammount= p * Math.pow(1+(r/n), n*t);
		double cintrest= ammount -p;
		 System.out.println("amoount after "+t+ " years is "+ammount);
		 System.out.println("compound intrest after " + t +" years is" +cintrest);
		 
	System.out.println(Math.max(10.05, 11.11));
	
	
			

	}

}
