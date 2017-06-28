 package cse;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string :");
		String s1 = scan.nextLine();
		
		String s2[] = s1.split(" ");
		String s3 = "";
		
		for(int i=s2.length-1;i>=0;i--){
			s3 = s3+s2[i]+" ";
		}
		System.out.println(s3+" ");
		scan.close();
	}

}
