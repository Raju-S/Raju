package guvi;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		int a[] = new int[n];
		int m;
		int sum=0;
		int i=0;
		int count = 0;
		while(n!=0){
			m=n%10;
			a[i]=m;
			n/=10;
			i++;
			count++;
		}
		for(i=0;i<count;i++){
			for(int j=i+1;j<count;j++){
				if(a[i]>a[j]){
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0;i<count;i++){
			System.out.print(a[i]+" ");
		}
	}

}
