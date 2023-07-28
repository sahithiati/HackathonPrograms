package assignments;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeArrays();
	}
	
	public static void mergeArrays()
    {
        int a1[]= new int[5];
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter 5 integers for first array: ");
	    for(int i=0;i<5;i++) {
	    a1[i] = input.nextInt();
	    }  
	    int n=5;
	    int m=5;
	    int a2[]= new int[5];
	    System.out.print("Enter 5 integers for second array: ");
	    for(int i=0;i<5;i++) {
	    a2[i] = input.nextInt();
	    } 
        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();
       
        // Inserting values to a map.
        for(int i = 0; i < n; i++)
        {
            mp.put(a1[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(a2[i], true);
        }
               // Printing keys of the map.
        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }
}
