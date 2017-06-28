package guvi;

import java.util.Scanner;

public class WorkingDay {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Day :");
		String str = scan.nextLine();
		if(str.equals("sunday")|| str.equals("saturday") || str.equalsIgnoreCase("saturday") || str.equalsIgnoreCase("sunday")){
			System.out.println(str+" = "+" false");
		}
		else{
			System.out.println(str+" = "+" true");
		}
	}
}
