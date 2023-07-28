package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			uniqueWords();
	}
	public static void uniqueWords(){
        Scanner sc;  				
		String uniqueWords;
		sc= new Scanner(System.in);
		System.out.print("Enter String to find uinque words:  ");
		uniqueWords = sc.nextLine();
		String[] words = uniqueWords.split("\\W");
        List<String> al = new ArrayList<>(Arrays.asList(words));
        for(String x:al)  {
            if(Collections.frequency(al,x)==1){
                System.out.println(x);
		    }
        }
        sc.close();  
    } 
}
