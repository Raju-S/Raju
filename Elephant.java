package cse;

import java.util.Arrays;
import java.util.Scanner;

public class Elephant {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt();
		int w = scan.nextInt();
		int count=0,i=0,j=0,sum=0;
		int a[] = new int[e];
		for(i=0;i<a.length;i++){
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<a.length;i++){
		
			if(sum<w){
				sum = sum+a[i];
				if(sum<w){
					++count;
				}
		}
				
	}
	System.out.println(count);
}
		
		
}

