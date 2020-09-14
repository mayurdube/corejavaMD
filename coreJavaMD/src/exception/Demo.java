package exception;
import java.util.Scanner;


public class Demo {


		
		void method1()
		{
			//arrays
			int array1[] = new int[5];
			array1[0] =8;
			array1[1]=76;
			array1[2] = 87;
			array1[3] =34;
			array1[4]  =98;
			
			System.out.println(array1[0]);
			System.out.println(array1[1]);
			System.out.println(array1[2]);
			System.out.println(array1[3]);
			System.out.println(array1[4]);
			//System.out.println(array1[5]); 
			//index out of bound
			
		}
		
		
		void method2()
		{
			
			int array2[] = new int[5];
			
			Scanner sc = new Scanner(System.in);
			
			
			//getting number from user
			System.out.println("Enter elements in array: ");
			
			for(int i=0;i<5;i++)
			{
				array2[i] = sc.nextInt();
			}
			
			
			//printing the numbers given by user 
			System.out.println("Elements entered are: ");
			for(int i=0;i<5;i++)
			{
				System.out.println("element is : "+array2[i]);
			}
			
			
			
			int result=0;
			
			
			
			try
			{
				result = (array2[1]/array2[2]); //exception 1
				System.out.println("Result is :"+result);
				System.out.println(array2[8]);  //exception 2
			}
			
		
			catch (ArithmeticException e) {
				
				System.out.println("Infinite");
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("plese ask for the number less than array size");
			}
			
			//cleanup activities
			finally
			{
				//statement 6
				/*used to write the clean up code irrespective of whether
				 * the exception is arise or not,whether it is handled 
				 * or not,this block gets executed all the time*/
				System.out.println("statement 6 finally demo");
			}
			
			
			
			
		}
	
}
