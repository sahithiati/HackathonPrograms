package assignments;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Assignment1 {

	public static void main(String[] args) throws IOException {
		Assignment1 assignment = new Assignment1(); 
		assignment.sortIntegers();
		checkBoolean();
		factorial();
	    palindrome();
		uniqueOccurences();
		selectionSort();
		reverseStr();
		reverseWords();
		uniqueWords();
		removeChar();
		countChar();
		duplicateChar();
		occurenceOfChar();
        repeatedChar();
		convertStringToInteger();
		convertIntegerToString();
		differentiateInput();
		
		Scanner sc=new Scanner(System.in); 				
		System.out.print("Enter integer to find its factorial: ");
		int n = sc.nextInt();
		int fact = recurrsionFactorial(n);
		System.out.println("The factorial of "+n+" is: "+fact);
		sc.close();
		
		//readFileAndWriteInReverse();
		
	}
	
	public static void checkBoolean(){
		boolean first;
	    boolean second;
	    boolean third;
	    boolean result;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter first boolean value: ");
	    first = input.nextBoolean();

	    System.out.print("Enter second boolean value: ");
	    second = input.nextBoolean();

	    System.out.print("Enter third boolean value: ");
	    third = input.nextBoolean();
	    
	    if(first) {
	        result = second || third;
	      }
	      else {
	        result = second && third;
	      }

	      if(result) {
	        System.out.println("Two boolean variables are true.");
	      }
	      else {
	        System.out.println("Two boolean variables are not true.");
	      }

	      input.close();
	}
	
	public static void factorial(){
		int n;
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter value to find its factorial: ");
	    n = input.nextInt();
	    
	    int fact=1;
	    for(int i=1;i<=n;i++){
	    	
	    	fact*=i;
	    }
	    System.out.printf("Factorial of " + n + " = "+fact);
	    input.close();
	}
	
	public void sortIntegers(){
		int n[]= new int[5];
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter 5 integer values to sort: ");
	    for(int i=0;i<5;i++) {
	    n[i] = input.nextInt();
	    }
	    
	    Arrays.sort(n);
	    System.out.println("Array after sorting: ");
	    for(int j=0;j<5;j++) {
	    	 System.out.println(n[j]);
		    }
	   
	 input.close();
	}
	
     
    public static void palindrome(){
		String original, reverse = ""; // Objects of String class  
        Scanner in = new Scanner(System.in);   
        System.out.println("Enter a string/number to check if it is a palindrome");  
        original = in.nextLine();   
        int length = original.length();   
        for ( int i = length - 1; i >= 0; i-- )  
           reverse = reverse + original.charAt(i);  
        if (original.equals(reverse))  
           System.out.println("Entered string/number is a palindrome.");  
        else  
           System.out.println("Entered string/number isn't a palindrome."); 
        in.close();
    } 
    
    public static void uniqueOccurences(){
    	Scanner input = new Scanner(System.in);
        int [] num = new int[100]; 
        int [] count = new int[100];
        
        int i,temp = 0;
        System.out.println("Enter 10 integers: ");

        for(i=0; i <10; i++){
        num[i] = input.nextInt();
        
        for(i = 0; i < num.length; i++){
                temp = num[i];
                count[temp]++;
        }

        for(i=1; i < count.length; i++){

            if(count[i] > 0 && count[i] == 1){
             System.out.printf("%d occurs %d time and it is unique number\n",i, count[i]);
             }
            else if(count[i] >=2){
                System.out.printf("%d occurs %d times\n",i, count[i]);
            }
            
         }
       }
        input.close();
    }    
    
    public static void selectionSort() {
    	
        int arr[]= new int[5];
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter 5 integer values to sort: ");
	    for(int i=0;i<5;i++) {
	    arr[i] = input.nextInt();
	    }
    	
    	int n = 5;
    	 
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            input.close();
        }
        
        // Prints the array
           System.out.println("Array after sorting: ");
           for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
            System.out.println();
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
    
    public static void repeatedChar(){
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
		if(cOfUpper>1) {
		System.out.println("The number of Uppercase characters repeated in the given string is: "+cOfUpper);
		   } 
		if(cOfLower>1) {
			System.out.println("The number of Lowercase characters repeated in the given string is: "+cOfLower);
			}
		if(cOfInt>1) {
			System.out.println("The number of Integers repeated in the given string is: "+cOfInt);
		}
		sc.close();
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
    
    public static void convertIntegerToString(){
        Scanner sc=new Scanner(System.in); 				
		String str;
		System.out.print("Enter integer to convert to string:  ");
		int n = sc.nextInt();
		str = Integer.toString(n);  
		System.out.println("The string values is: "+ str);
		sc.close();
    }
    
    public static int recurrsionFactorial(int n){
      
	   	if (n<=2) {
    		return n;
    	}else { 
    	  	return n * recurrsionFactorial(n-1);
    	}	
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
    
    public static void readFileAndWriteInReverse() throws IOException{
    	
    	String fileContents = null;
    	File file = new File("text.txt");
    	Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
             fileContents += input.nextLine();            
        }
        String reverseFileContents = reverseGivenStr(fileContents);
        		
        
        
        input.close();
        
        String outPutFileName = "outputfile.txt";  
        FileWriter myWriter = new FileWriter(outPutFileName);
        myWriter.write(reverseFileContents);
        myWriter.close();
    	
      }
    
		 public static String reverseGivenStr(String contents){
				
			    
		    String reverse = "";
		    for(int i=contents.length()-1; i>=0; i--) {
		      reverse =  reverse + contents.charAt(i);
		    }
			return reverse;
		        
		   }
}  
    
    
		

    
