import java.util.Scanner;
public class favoritecity {
	

	public static void main(String[] args)
	{
		String city;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the name of your favorite City");
        city = keyboard.nextLine();
        System.out.println (city.length());
        System.out.println (city.toUpperCase());
        System.out.println (city.toLowerCase());
        System.out.println (city.charAt(0));
        
        
	}
	

}
