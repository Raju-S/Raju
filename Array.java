package cse;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		System.out.println("enterv the size:");
		int n = scan.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]+a[j]==0){
					System.out.println(a[i]+" "+a[j]+ " => "+(a[i]+a[j]));
				}
			}
		}
	}

}
