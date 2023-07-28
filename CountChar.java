package assignments;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			countChar();
	}
	public static void countChar(){
        Scanner sc;  				
		String str;
		sc= new Scanner(System.in);
		System.out.print("Enter String:  ");
		str = sc.nextLine();
		int cOfUpper=0;
		int cOfLower=0;
		int cOfInt=0;
		
		char[] str1= str.toCharArray();
		
		int len=str1.length;
		
		for(int i=0;i<len;i++) {
			
			int charAsciiValue = str1[i];
					
			if(charAsciiValue>=65 && charAsciiValue<=90) {
				cOfUpper++;
		    }else if(charAsciiValue>=97 && charAsciiValue<=122) {
		    	cOfLower++;
		    }else if (charAsciiValue>=48 && charAsciiValue<=57) {
		    	cOfInt++;
		    }
		}
		
		System.out.println("The number of Uppercase characters in the given string is: "+cOfUpper);
		System.out.println("The number of Lowercase characters in the given string is: "+cOfLower);
		System.out.println("The number of Integers in the given string is: "+cOfInt);
		sc.close();
    }
}
