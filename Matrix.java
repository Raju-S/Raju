package guvi;

import java.util.Scanner;

public class Matrix {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("4*4 Matrix : ");
		int a[][] = new int[4][4];
		System.out.println("Enter the Elements :");
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("The Elements are:");
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
