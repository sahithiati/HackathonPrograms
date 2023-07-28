package assignments;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWords();
	}
	public static void reverseWords(){
        Scanner sc;  				
		String revStrWords;
		sc= new Scanner(System.in);
		System.out.print("Enter String to Reverse its words:  ");
		revStrWords = sc.nextLine();
					
		
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(revStrWords);
        String result = "";
 
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        System.out.println("The reverse of words is "+result); 
        sc.close();    
     }
}
