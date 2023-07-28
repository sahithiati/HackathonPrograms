package assignments;

import java.util.Scanner;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    convertStringToInteger();
	}
	public static void convertStringToInteger(){
        Scanner sc;  				
		String str;
		sc= new Scanner(System.in);
		System.out.print("Enter String to convert to integer:  ");
		str = sc.nextLine();
		int i= Integer.parseInt(str);
		System.out.println("The integer values is: "+i);
		sc.close();
    }
}
