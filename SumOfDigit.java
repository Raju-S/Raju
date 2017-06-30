package guvi;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int sum =0;
		while(n!=0){
			int temp = n;
			while(temp>0){
				int m = temp%10;
				sum = sum+m;
				temp/=10;
			}
			n/=10;
		}
		System.out.println("output=> "+sum);
	}

}
