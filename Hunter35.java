package guvi;
import java.util.*;


public class Hunter35 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=scan.next();
		int len = str1.length();
		String str2 = str1.substring(0,len/2);
		//System.out.println(str2);
		String str3 = str1.substring(len/2,str1.length());
		StringBuffer sb = new StringBuffer(str3);
		//System.out.println(str3);
		if(str2.equals(str3) && str1.length()%2==0){
			System.out.println("Double String");
		}
		else{
			System.out.println("Not Double String");
		}
		
	}

}
