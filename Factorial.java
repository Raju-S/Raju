public class Factorial {
	
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value :");
	int n = scan.nextInt();
	int result = factorial(n);
	System.out.println("The Factorial of " + n + " is " +result);

}

	public static int factorial(int n) {
		if(n==0)
		return 1;
		else
			return(n*factorial(n-1));
	}	
	
	
}