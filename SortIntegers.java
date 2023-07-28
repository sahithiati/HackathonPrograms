package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortGivenIntegers();
	}
	
	public static void sortGivenIntegers(){
		int n[]= new int[5];
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter 5 integer values to sort: ");
	    for(int i=0;i<5;i++) {
	    n[i] = input.nextInt();
	    }
	    
	  //sorting logic 
	    System.out.print("Array after sorting: ");
	    for (int i = 0; i < 5; i++)   
	    {  
	      for (int j = i + 1; j < 5; j++)   
	      {  
	    	int tmp = 0;  
	    	if (n[i] > n[j])   
	    	{  
	    		tmp = n[i];  
	    		n[i] = n[j];  
	    		n[j] = tmp;  
	        }  
	      }  
	    //prints the sorted element of the array  
	    System.out.println(n[i]);  
	   }
	    input.close();
	    
	}   
}
