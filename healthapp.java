package healthapp;

import java.util.Scanner;

public class healthapp {

	
	public static void main(String[] args) {
		
		System.out.println("This app will tell you how many food items");
		System.out.println("you can eat with the calories you burned");
		int Hamburgers, hotdogs, frenchfries, oreocookie, pizzaslice, soda, icecream, donut, chips;
		double calories;
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter the calories you burned today:");
	    calories = keyboard.nextDouble();
	    
	    if (calories >= 45)
		    System.out.println("You can eat one Oreo Cookie");
	    if (calories >= 356)
		    System.out.println("or you can eat one medium serving of French Fries");
	    if (calories >= 354)
	    System.out.println("Or you can eat one Hamburger (120g)");
	    if (calories >= 285)
		    System.out.println("Or you can eat one slice of Pizza (107g)");
	    if (calories >= 195)
		    System.out.println("Or you can eat one Donut");
	    if (calories >= 152)
		    System.out.println("Or you can eat Potato Chips (1oz)");
	    if (calories >= 151)
		    System.out.println("Or you can eat one Hotdog (52g)");
	    if (calories >= 150)
		    System.out.println("Or you can eat one can of Soda (12oz)");
	    if (calories >= 137)
		    System.out.println("Or you can eat one serving of Ice Cream (66g)");
	    if (calories < 45)
	    	System.out.println("You need to excercise more");
	    
	    
	    
	    
	    
	    

	    
	     }}
		

