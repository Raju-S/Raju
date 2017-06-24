import java.io.*;
import java.util.*;

public class Chocolate {
		
		public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			int M = scan.nextInt();
			int N = scan.nextInt();
			 
			System.out.println(choco(M,N));
			
		
		}

		private static int choco(int m, int n) {
			
			if(m==0 || n==0){
				return 0;
			}
			else{
				return(m*n-1);
			}
			
		}

	}
	
			
