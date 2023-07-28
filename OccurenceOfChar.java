package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			occurenceOfChar();
	}
	public static void occurenceOfChar(){
        Scanner sc;  				
		String str;
		Map<Character,Integer> mapOfChars = new HashMap<Character,Integer>();
		sc= new Scanner(System.in);
		System.out.print("Enter String to find occurence of characters:  ");
		str = sc.nextLine();
        char[] str1= str.toCharArray();
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
			
				System.out.println(c + " occurs " +mapOfChars.get(c)+" time(s)");
				
		}
		sc.close();    
    }
}
