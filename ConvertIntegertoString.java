package assignments;

import java.util.Scanner;

public class ConvertIntegertoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			convertIntegerToString();
	}
	public static void convertIntegerToString(){
        Scanner sc=new Scanner(System.in); 				
		String str;
		System.out.print("Enter integer to convert to string:  ");
		int n = sc.nextInt();
		str = Integer.toString(n);  
		System.out.println("The string values is: "+ str);
		sc.close();
    }
}
