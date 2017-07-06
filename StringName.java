package guvi;

import java.util.Scanner;

public class StringName {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("First_Name : ");
		String str1 = scan.nextLine();
		char[] c = str1.toCharArray();
		System.out.println("Last_Name : ");
		String str2 = scan.nextLine();
		char[] cc = str2.toCharArray();
		System.out.println("PIN : ");
		String pin = scan.next();
		System.out.println("N : ");
		int n = scan.nextInt();
		String Longer_name = null;
		String Smaller_name = null;
		int i = 0;
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1!=len2){
			 Longer_name = str1.substring(0,1);
			 Smaller_name = str2.substring(0,len2);
			 char c1 = pin.charAt(n-1);
			 String rev = new StringBuffer(pin).reverse().toString();
			 char c2 = rev.charAt(n-1);
			 System.out.println(Longer_name+Smaller_name+c1+c2);

			
 		}
		else{
			int a = (char)c[i];
			int b = (char)cc[i];
			if(a<b){
				Smaller_name = str1.substring(0,1);
				Longer_name = str2.substring(0, len2);
				char c1 = pin.charAt(n-1);
				String rev = new StringBuffer(pin).reverse().toString();
				char c2 = rev.charAt(n-1);
				System.out.println(Smaller_name+Longer_name+c1+c2);

			}
			else{
				Longer_name = str2.substring(0,1);
				Smaller_name = str1.substring(0, len1);
				char c1 = pin.charAt(n-1);
				String rev = new StringBuffer(pin).reverse().toString();
				char c2 = rev.charAt(n-1);
				System.out.println(Longer_name+Smaller_name+c1+c2);

				
			}
			
		
		}
	
	}

}
