package guvi;

import java.util.Scanner;

public class Palindrome {
	
	public static  void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str1 = scan.nextLine();
		System.out.println("Enter delete index :");
		int d = scan.nextInt();
		String str2 = new StringBuffer(str1).deleteCharAt(d).toString();
		String str3 = new StringBuffer(str2).reverse().toString();
		if(str2.equalsIgnoreCase(str3)){
			System.out.println(str2+ " is Palindrome");
		}
		else{
			System.out.println(str2+" is not Palindrome");
		}
		
		
		
	}

}
