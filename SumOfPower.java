package guvi;

import java.util.Scanner;

public class SumOfPower {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int m[] = new int[10];
		int sum = 0,count = 0;
		int i = 0;
		int j = 0;
		while(n>0){
		int m1 = n%10;
		m[i] = m1;
		n/=10;
		i++;
		count++;
		
	}
	
	for(i=count-1;i>=0;i--,j++)
	{
		sum = (int) (sum + Math.pow(m[i],j));
	}	
	System.out.println(sum);
	}

}
