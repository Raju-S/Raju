package guvi;

import java.util.Scanner;

public class Matrix {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row : ");
		int r = scan.nextInt();
		System.out.println("Enter the column : ");
		int c = scan.nextInt();
		
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j] = scan.nextInt();
				b[i][j] = a[i][j];
			}
		}
		
		System.out.println("The original matrix is :");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				for(int k=j+1;k<c;k++){
					if(a[i][j]>a[i][k]){
						int temp;
						temp = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = temp;
					}
				}
			}
		}
		System.out.println("Rows in matrix : ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int j=0;j<c;j++){
			for(int i=0;i<r;i++){
				for(int k=i+1;k<r;k++){
					if(b[i][j]<b[k][j]){
						int temp;
						temp = b[i][j];
						b[i][j] = b[k][j];
						b[k][j] = temp;
					}
				}
			}
		}
		System.out.println("columns in matrix : ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
