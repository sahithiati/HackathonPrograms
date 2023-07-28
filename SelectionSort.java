package assignments;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort();
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
}
