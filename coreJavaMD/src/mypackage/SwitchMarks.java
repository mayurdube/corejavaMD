package mypackage;
import java.util.Scanner;

public class SwitchMarks {

	public static void main(String[] args) {
		
		int sub1, sub2, sub3,sub4, sub5;
		Scanner marks = new Scanner(System.in);
		
		
		
		System.out.println("Marks Of sub1 :");
		sub1 = marks.nextInt();
		System.out.println("Marks Of sub2 :");
		sub2 = marks.nextInt();
		System.out.println("Marks Of sub3 :");
		sub3 = marks.nextInt();
		System.out.println("Marks Of sub4 :");
		sub4 = marks.nextInt();
		System.out.println("Marks Of sub5 :");
		sub5 = marks.nextInt();
		
		int total = sub1+sub2+sub3+sub4+sub5;
		int per = total/5 ;
		System.out.println("student get " +per+" percentages");
		
		/*
		if(per >= 90) {System.out.println("GRADE A");
		}else if (per >= 80) {System.out.println("GRADE B");
		}else if (per >=70) {System.out.println("GRADE C");
		}else if (per >= 60) {System.out.println("GRADE D");
		}else if (per >= 40) {System.out.println("GRADE E");
		}else {System.out.println("GRADE F");
		}
		*/
		
		
		
		
		

	}

}
