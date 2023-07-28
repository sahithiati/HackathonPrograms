package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateChar();
	}
	public static void duplicateChar(){
        Scanner sc;  				
		String str;
		Map<Character,Integer> mapOfChars = new HashMap<Character,Integer>();
		sc= new Scanner(System.in);
		System.out.print("Enter String to find duplicate characters:  ");
		str = sc.nextLine();
        char[] str1= str.toCharArray();
		System.out.println("The duplicate characters in the given string are: ");
				
		for(char c: str1) {
			if(!mapOfChars.containsKey(c)) {
				mapOfChars.put(c, 1);
			}
			else {
				int countOfChar = mapOfChars.get(c);	
				countOfChar ++;
				mapOfChars.put(c, countOfChar);
			}
		}
		for(Character c: mapOfChars.keySet()) {
			if(mapOfChars.get(c)>1) {
				System.out.println(c);
			}	
		}
		sc.close();
	 }
}
