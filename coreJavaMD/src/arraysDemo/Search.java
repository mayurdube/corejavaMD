package arraysDemo;

import java.util.Scanner;

public class Search
{

	
	void input() 
	{
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of an array");
		
		size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the elements in the array");
		
		for(int i=0; i <arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the search element");
		int search = sc.nextInt();
		
		int index = linearSearch(arr,search);
		display(arr,search,index);
	}
	
	int linearSearch(int arr[],int search) {
		for(int i=0; i<arr.length; i++) {
			if(search == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	void display(int arr[], int search, int index) {
		System.out.println("elements in the array are follows");
		
		for(int i:arr) 
		{
			System.out.println("Elements are :"+i);
		}
		
		if(index >0) {
			System.out.println("the search elemnts is "+search +"& found at index "+index);
		}else {
			System.out.println("element is not in the array");
		}
		
		
		
	}
	
	
	
	
}
