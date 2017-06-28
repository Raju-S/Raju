package guvi;

import java.util.Scanner;

public class StringAscii {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n1 =0;
		System.out.println("Enter the string : ");
		String str = scan.nextLine();
		int n = str.length();
		 for(int i=0;i<n-1;i++){
			 sum = sum + ((int)str.charAt(i+1)-(int)str.charAt(i));
		 }
		 n1 = sum - ((int)str.charAt(0));
		 System.out.println("Finally (n1) = "+n1);	
		 System.out.println("Corresponding Character of "+n1+" is "+(char)n1);
		
	} 
}
