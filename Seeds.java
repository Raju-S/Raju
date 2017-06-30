package guvi;

import java.util.Scanner;

public class Seeds {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int c[] = new int[10];
		int i = 0;
		int count = 0;
		int sum = 1;
		int sum1 = n;
		while(n>0){
			int m = n%10;
			c[i] = m;
			n/=10;
			i++;
			count++;
		}
		for(i=count-1;i>=0;i--){
			sum = sum * c[i] ;
		}
		System.out.println(sum*sum1);
	}

}
