package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDigit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		int i = 0,m=0,count=0;
		int rev[] = new int[5];
		while(n>0){
			m = n%10;
			rev[i] = rev[i]*10+m;
			n/=10;
			i++;
		}
		Arrays.sort(rev);
		System.out.println("Enter the k digit : ");
		int k=scan.nextInt();
		for(i=0;i<rev.length-k;i++){
			System.out.print(rev[i]+" ");
		}
		

	}

}
