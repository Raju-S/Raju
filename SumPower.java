package guvi;

import java.util.Scanner;

public class SumPower {

	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n = scan.nextInt();
	int i = 0;
	int count = 0;
	int sum = 0;
	int sum1 =0;
	int c[] = new int[10];
	while(n!=0){
		int m = n%10;
		c[i] = m;
		n/=10;
		i++;
		count++;
	}
	for(i=count-1;i>=0;i--){
		sum = (int) (sum + Math.pow(c[i],c[i+1]));
	}
	System.out.println("Sum is : "+sum);
	
	}
	

}
