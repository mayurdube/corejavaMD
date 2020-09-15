package arraysDemo;

import java.util.Scanner;

public class arrayAvg {
	
	void input() 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Plese Enter the size of array you want");
		int size = in.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("put the marks of the student");

		for(int i =0; i<size;i++)
		{
			array[i]=in.nextInt();
		}

		average(array, size, size);
	}
	
	void average(int array[], int size, int sum) 
	{
		sum =0;
		for(int i =0; i<size; i++) {
			
			sum = sum + array[i];
			
			
			
			
		}
		int average= sum/size;
		display(array,sum,average);
	}
	
	void display(int array[],int  sum,int average)
    {
		
		for(int i : array)
		{
			System.out.println("marks of the student are " +i);
		
			
		}
		System.out.println("the total of the marks is : "+sum);
		System.out.println("average of the marks is : "+average);
		
	}
	
	
	

}
