package assignments;

import java.util.Scanner;

public class DifferentiateInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			differentiateInput();
	}
	public static void differentiateInput(){
        Scanner sc;  				
		String str;
		sc= new Scanner(System.in);
		System.out.print("Enter String:  ");
		str = sc.nextLine();
		int cOfStr=0;
		int cOfInt=0;
		char[] str1= str.toCharArray();
		int len=str1.length;
								
		for(int i=0;i<len;i++) {
			
			int charAsciiValue = str1[i];
					
			if((charAsciiValue>=65 && charAsciiValue<=90) || (charAsciiValue>=97 && charAsciiValue<=122)) {
				cOfStr++;
		    }else if (charAsciiValue>=48 && charAsciiValue<=57) {
		    	cOfInt++;
		    }
		}
		if (str.equalsIgnoreCase("true")||str.equalsIgnoreCase("false")) {
			System.out.println("The given input is boolean");
		}else if(cOfStr==len) {
			System.out.println("The given input is string");	
		}else if(cOfInt==len) {
			System.out.println("The given input is integers");
		}else if ((cOfStr!=len)||(cOfInt!=len)) {
			System.out.println("The given input is string");
		}
		sc.close();
	}
}
