package mypackage;
import java.util.Scanner;

public class Fibodemo {

	public static void main(String[] args) {
		
		int i,firstNumber,secondNumber,thirdNumber,userNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("userNumber :");
		userNumber=sc.nextInt();
		firstNumber=0;
		secondNumber=1;
		System.out.print(firstNumber+" "+secondNumber);
		
		
		
		
		
		for(i=0; i<=userNumber; i++) {
			thirdNumber= firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
			System.out.print(" "+thirdNumber);
			
			
		}

	}

}
