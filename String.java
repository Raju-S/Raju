import java.io.*;

public class String {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String str1 = scan.nextLine();
		System.out.println("Enter the First String : ");
		String str2 = scan.nextLine();
		
			int n1 = str1.length();
			int n2 = str2.length();
			
			for(int i=0;i<n1;i++){
				String s1 = str1.substring(i,i+2);
				if(str2.contains(s1)){
					System.out.println("The output is True");
					break;
				}
				else{
					System.out.println("The output is False");
					break;
				}
			}
	}
	
			
}
