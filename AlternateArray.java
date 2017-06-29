package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateArray {
	public static void main(String args[]){
		int i;
		Scanner scan = new Scanner(System.in);
		int max = -999999;
		int min = 999999;
		System.out.println("Enter the size : ");
		int n = scan.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		for(i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		if(n%2==1){
			System.out.print(a[0]+" ");
		for( i=1;i<=n/2;i++){

			System.out.print(a[a.length-i]+" ");
			System.out.print(a[i]+" ");
		}
		
		}
		else{
			System.out.print(a[0]+" ");
			for( i=1;i<n/2;i++){
				
				System.out.print(a[a.length-i]+" ");
				System.out.print(a[i]+" ");
			}
			System.out.print(a[a.length-i]+" ");
		}
		
		
	
}
	

}
