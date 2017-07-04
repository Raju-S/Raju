package guvi;

import java.util.Scanner;

public class PaliSum {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int m = 0,m1=0;
		int sum = 0;
		int rev = 0;
		System.out.println("Enter the Number : ");
		int n = scan.nextInt();
		while(n>0){
			m = n%10;
			sum = sum + m;
			n/=10;
		}
		System.out.println("Sum is : "+sum);
		String str1 = Integer.toString(sum);
		while(sum>0){
			m1 = sum%10;
			rev = (rev*10)+m1;
			sum/=10;
		}
		System.out.println("rev : "+rev);
		String str2 = Integer.toString(rev);
		if(str1.equals(str2)){
			System.out.println("Palindrome number");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
	

}
