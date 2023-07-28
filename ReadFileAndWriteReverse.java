package assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileAndWriteReverse {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
			readFileAndWriteInReverse();
	}
      public static void readFileAndWriteInReverse() throws IOException{
    	
    	String fileContents = null;
    	File file = new File("text.txt");
    	Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
             fileContents += input.nextLine();            
        }
        String reverseFileContents = reverseGivenStr(fileContents);
        System.out.println(reverseFileContents);
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
