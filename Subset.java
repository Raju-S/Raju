package cse;
import java.util.*;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {3,5,1};
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		
		for(int i=0;i<a1.length;i++){
			A1.add(a1[i]);
		}
		System.out.println("A1 : "+A1);
		for(int j=0;j<a2.length;j++){
			A2.add(a2[j]);
		}
		System.out.println("A2 : "+A2);
		
		if(A1.containsAll(A2)){
			System.out.println("Subset");
		}
		else{
			System.out.println("Not subset");
		}
	}

}
