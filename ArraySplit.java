package guvi;

import java.util.Scanner;

public class ArraySplit {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array  size:");
		int n = scan.nextInt();
		int sum =0,sum1=0,sum2=0,s1=0,s2=0;
		int avg =0,avg1=0,avg2=0;
		int a[] = new int[n];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
			sum = sum +a[i];
		}
		avg = sum / n;
		for(int i=0;i<a.length-avg;i++){
			s1 = s1+a[i];
		}
		for(int i=a.length-1;i>=avg;i--){
			s2 = s2+a[i];
		}
		if(s1 % s2 == 0){
			for(int i=0;i<a.length-avg;i++){
				 sum1 = sum+ a[i];
			}
			 avg1 = sum1/avg;
			
			for(int i=0;i<a.length-avg;i++){
				 sum2 = sum+ a[i];
			}
			 avg2 = sum2/avg;
			 int j = a.length-avg;
			 if(avg1==avg2){
				 for(int i=0;i<=j;i++){
					 System.out.print(a[i]+" ");
				 }
				 System.out.print(", ");
				 for(int i=a.length-1;i>=avg;i--){
					 System.out.print(a[i]+" ");
				 }
			 }
			
		}
		else{
			System.out.println("Not Possible");
		}
	}

}
