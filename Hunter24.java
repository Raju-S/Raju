package guvi;
import java.util.*;

public class Hunter24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = scan.nextInt();
		int a[] = new int[n];
		int i,j;
		for(i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the target number : ");
		int t = scan.nextInt();
		for(i=0;i<a.length;i++){
			for(j=i+1;j<a.length;j++){
				if(a[i]+a[j]==t){
					System.out.println(a[i]+" "+a[j]);
					break;
				}
				
			}
		}

	}

}
