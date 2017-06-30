package guvi;

import java.util.Scanner;

public class MatrixSum {
	
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	System.out.println("Enter the size: ");
	int n = scan.nextInt();
	int a[][] = new int [n][n];
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			a[i][j] = scan.nextInt();
			if(a[i]==a[j]){
				sum = sum + a[i][j];
			}
		}
	}
	System.out.println("Sum is : "+sum);
	
	
	}
	

}
