package assignments;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			removeChar();
	}
	
	public static void removeChar(){
        Scanner sc;  				
		String str;
		sc= new Scanner(System.in);
		System.out.print("Enter String:  ");
		str = sc.nextLine();
		System.out.println("Enter Character to be removed: ");
		String r= sc.nextLine();
		String str1= str.replace(r,"");
		System.out.println("String after removing "+ r + " is: " + str1);
		sc.close();
	}

}
