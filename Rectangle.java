package guvi;

import java.util.Scanner;

public class Rectangle {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Left top (1st rectangle)");
		int a1 = scan.nextInt();
		int b1 = scan.nextInt();
		System.out.println("Enter the Right top (1st rectangle)");
		int a2 = scan.nextInt();
		int b2 = scan.nextInt();
		System.out.println("Enter the Left top (2nd rectangle)");
		int a3 = scan.nextInt();
		int b3 = scan.nextInt();
		System.out.println("Enter the Right top (2nd rectangle)");
		int a4 = scan.nextInt();
		int b4 = scan.nextInt();
		
		if((a1>a4 && b1>b4) || (a2<a3 && b2<b3)){
			System.out.println("Does not overlap");
		}
		else{
			System.out.println("Overlap");
		}
		
	}

}
