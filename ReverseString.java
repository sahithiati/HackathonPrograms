package assignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseStr();
	}
    public static void reverseStr(){
		
	    String str=null;
	        String reverse="";
	        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to reverse: ");
        
        str=sc.nextLine();
         
        for(int i=str.length()-1; i>=0; i--) {
          reverse =  reverse + str.charAt(i);
        }
         
        System.out.println("The reverse of "+str+" is "+reverse);
        sc.close();    
     } 
}
