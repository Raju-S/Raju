package guvi;

import java.util.Scanner;

public class Array {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		System.out.println("Enter the Size of the Array :");
		int n = scan.nextInt();
		int a[] = new int[n];
		int count[] = new int[10];
		for(i=0;i<n;i++){
			a[i] = scan.nextInt();
			sum = sum+a[i];
		}
		System.out.println("Sum of the Array : "+sum);
		for(i=0;i<a.length;i++){
			
			int temp = a[i];
			while(a[i]>0){
				count[a[i]%10]++;
				a[i]/=10;
			}
			a[i]/=10;
		}
		for(i=0;i<10;i++){
			System.out.println(i+" occur "+count[i]+" times");
		}
	}
}
