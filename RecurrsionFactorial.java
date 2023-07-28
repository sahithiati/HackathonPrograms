package assignments;

import java.util.Scanner;

public class RecurrsionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 				
		System.out.print("Enter integer to find its factorial: ");
		int n = sc.nextInt();
		int fact = recurrsionFactorial(n);
		System.out.println("The factorial of "+n+" is: "+fact);
		sc.close();
	}
	public static int recurrsionFactorial(int n){
	      
	   	if (n<=2) {
    		return n;
    	}else { 
    	  	return n * recurrsionFactorial(n-1);
    	}	
     }
}
