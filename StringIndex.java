package guvi;

import java.util.Scanner;

public class StringIndex {
	
public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String str = "This is an example for this question";
		String s[] = str.split(" ");
		for(i=0;i<s.length;i++){
			if(i%2==1){
				System.out.print(s[i]);
				
			}
			else{
				StringBuffer sb = new StringBuffer(s[i]);
				System.out.print(" "+sb.reverse()+" ");
			}
			
		}
	}
}
