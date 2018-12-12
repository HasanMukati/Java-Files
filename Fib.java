import java.util.Scanner;
public class Fib {
	

	public static void main(String[] args) {
		 
	        
		int fold1 = 1; 
	  	int fold2 = 1; 
		int Fnew = fold1 + fold2;
		int userInput;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for fibonacci: ");
		userInput = input.nextInt();

		if (userInput == 1) 
		{
		   System.out.println(fold1);
		}	 
		else if (userInput == 2) 
		{
		   System.out.println(fold2);
		}
		else if (userInput >= 3)
		{
		   int n=4; 
		   while (n <= userInput)
		   {
			fold2 = fold1; 
			fold1 = Fnew; 
			Fnew = fold2 + fold1; 
			n=n+1; 
		   }
		   
		   System.out.println(Fnew);
		}
		
	   }
	}