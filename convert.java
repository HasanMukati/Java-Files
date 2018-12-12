package convert;

import java.util.Scanner;

public class convert {
	public static void main(String[] args){
		double feet;
		double meter;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value of feet:");
		feet = input.nextDouble();
		meter = feet *0.305;
		System.out.println(feet + " is " + meter + " meters");
	}
}
