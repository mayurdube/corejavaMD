package arraysDemo;

import java.util.Scanner;

public class arrayFirst {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int  array1[] = new int[5];
		
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		array1[4]=50;
		
		System.out.println(array1[0]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		System.out.println(array1[1]);
		
		String Animals[] = new String[5];
		
		System.out.println("enter the name of the animal ");
		for(int i =0 ; i < Animals.length; i++) {
			Animals[i]=input.next();
		}
		
		
		//using for loop
		//for(int i =0 ; i < Animals.length; i++) {
//		System.out.println("Animal is "+Animals[i]);
//		}

		//for each
		for( String i : Animals) {
			System.out.println("animals are "+i);
		}
		
	}
	
	

}
