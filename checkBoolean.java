package assignments;

import java.util.Scanner;

public class checkBoolean {

	public static void main(String[] args) {
		checkBoolean();

	}
	
	public static void checkBoolean(){
		boolean first;
	    boolean second;
	    boolean third;
	    boolean result;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter first boolean value: ");
	    first = input.nextBoolean();

	    System.out.print("Enter second boolean value: ");
	    second = input.nextBoolean();

	    System.out.print("Enter third boolean value: ");
	    third = input.nextBoolean();
	    
	    if(first) {
	        result = second || third;
	      }
	      else {
	        result = second && third;
	      }

	      if(result) {
	        System.out.println("Two boolean variables are true.");
	      }
	      else {
	        System.out.println("Two boolean variables are not true.");
	      }

	      input.close();
	}
	

}
