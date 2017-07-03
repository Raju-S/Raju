package guvi;

import java.util.Scanner;

public class Function {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float r=5f;
		float length=12;
		float breadth=10;
		float height=6;
		
		System.out.println("Area of Circle : "+circle(r));
		System.out.println("Area of Rectangle : "+rec(length,breadth));
		System.out.println("Area of Triangle : "+tri(breadth,height));
	}

	private static float tri(float breadth, float height) {
		
		return ((breadth*height)/2);
	}

	private static float rec(float length, float breadth) {
		
		return length*breadth;
	}

	private static float circle(float r) {
		
		return (float)3.14*r*r;
	}
	
}
