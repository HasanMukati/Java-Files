package calander;
import java.util.Scanner;

public class calander {


	public static void main(String[] args) {
	
	System.out.println("1 for January");
	System.out.println("2 for Febuary");
	System.out.println("3 for March");
	System.out.println("And so on...");
	int month; 
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a number for any month:");
    month = keyboard.nextInt();
    
   
 
    
    if ((month < 1) || (month >12))
    	System.out.println("Enter number from 1 to 12");
   
    else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8)|| (month == 10)|| (month == 12))
    	System.out.println("31 Days");
    
    else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
    	System.out.println("30 Days");
    
    else if (month == 2) 
    	System.out.println("28 or 29 days");
    

    
     }
	
}
