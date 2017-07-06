package guvi;
import java.util.Scanner;

public class String69 {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		String str = scan.nextLine();
		
		int[] a = new int[10];
		int b[] = new int[10];
		int max=-9999,min=99999;
		int a1=0,a2=0,sum=0,sum1=0,sum2=0,sum3 = 1,sum4=0,sum5=0,a3=0,a4=0,i=0,count=0;
		String s1 = "";
		for(i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i)))
			{
				s1=s1+str.charAt(i);
			}
		}
		Integer n = Integer.valueOf(s1);
		i=0;
		while(n>0){
			int m = n%10;
			a[i] = m;
			n/=10;
			i++;
			count++;
		}
	
		for(i=0;i<count;i++){
				if(a[i]>max){
					max=a[i];
				}
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Largest digit is : "+max);
		
		
		for(i=0;i<count;i++){
				a1 = a[i]*max;
			sum = sum + a1;
		}
		System.out.println("Sum is(max) : "+sum);
		
		while(sum>0){
			a1 = sum % 10;
			sum1 = sum1 + a1;
			sum/=10;
		}
		System.out.println("sum is(max) : "+sum1);
		while(sum1>0){
			a1 = sum1 % 10;
			sum2 = sum2 + a1;
			sum1/=10;
		}
		System.out.println("sum is(max) : "+sum2);
		System.out.println();
		
		
		System.out.println("Smallest digit is : "+min);

		for(i=0;i<count;i++){
				a2 = a[i]+min;
			sum3 = sum3 * a2;
		}
		System.out.println("Sum is(min) : "+sum3);
		
		while(sum3>0){
			a2 = sum3%10;
			sum4 = sum4 + a2;
			sum3/=10;
		}
		System.out.println("sum is(min) : "+sum4);
		while(sum4>0){
			a2 = sum4%10;
			sum5 = sum5 + a2;
			sum4/=10;
		}
		System.out.println("sum is(min) : "+sum5);
	
		if(sum2<sum5){
			a3=sum2*sum2;
			System.out.println("Square is : "+a3);
		}
		else{
			a4=sum5*sum5;
			System.out.println("Square is : "+a4);
		}
		
	
	}

}

