package assignments;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial();
	}
	
	public static void factorial(){
		int n;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter value to find its factorial: ");
	    n = input.nextInt();
	    
	    int fact=1;
	    for(int i=1;i<=n;i++){
	    	
	    	fact*=i;
	    }
	    System.out.printf("Factorial of " + n + " = "+fact);
	    input.close();
	}

}
