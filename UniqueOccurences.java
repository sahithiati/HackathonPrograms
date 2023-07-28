package assignments;

import java.util.Scanner;

public class UniqueOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueOccurences();
	}
	
	public static void uniqueOccurences(){
    	Scanner input = new Scanner(System.in);
    	
        int [] num = new int[100]; 
        int [] count = new int[100];
        int i,temp = 0;
        System.out.println("Enter 10 integers: ");

            for(i=0; i <10; i++){
            num[i] = input.nextInt();
            }
            
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
}
