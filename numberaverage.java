import java.util.Scanner;
public class numberaverage {

	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);
	        float count = 0;
	        float total = 0; 
	        float num; 
	        float min = 0; 
	        float max = 0;
	        System.out.print("Enter numbers, ends with -1: ");
	      while (true) {
	            num = keyboard.nextFloat();
	            if(num == -1) break;
	            if(count == 0) {
	                min = num;
	                max = num;
	            }
	            if(num > max) max = num;
	            if(num < min) min = num;
	            total += num;
	            count++;
	        }
	        System.out.println("Average = " + (total / count));
	        System.out.println("Smallest = " + min);
	        System.out.println("Largest = " + max);
	        System.out.println("Range = " + (max - min));
	    }

	}