 package guvi;

import java.util.Scanner;

public class Pattern {
	
public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		for(int i = n;i > 0;i--){
			for(int j = i;j > 0;j--){
				System.out.print("*");
			}
			System.out.print(" ");
			for(int k = i;k > 0;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
