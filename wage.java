package wage;
import java.util.Scanner;

public class wage 
{

	public static void main(String[] args) {
	
	System.out.println("I will print out your paycheck");
	String name;
	double wage, hours, overtime;
	Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your name: ");
    name = keyboard.next();
    System.out.println("Enter your wage:");
    wage = keyboard.nextDouble();
    System.out.println("How many hours do you work per week?");
    hours = keyboard.nextDouble();
    
    overtime = ((hours - 40) *(wage)) *1.5;
 
    
    if (hours <= 40)
    System.out.println(name + " your paycheck is: " + " $"  + wage * hours);
    
    else if (hours >40)
    System.out.println(name + " your paycheck is: " +  " $"  + ((wage * 40) + (overtime)));
    
     }}
	

