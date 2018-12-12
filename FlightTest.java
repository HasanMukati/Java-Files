public class FlightTest {
	
	public static void main (String[] args)
	{
	Flight f1 = new Flight ("Delta", "Miami", "Atlanta", 54);
	Flight f2 = new Flight ("United", "Virginia", "London", 157);
	Flight f3 = new Flight ("Turkish", "Houston", "Turkey", 45);


	 
	System.out.println (f1);
	System.out.println (f2);
	System.out.println (f3);


	 
	System.out.print("flight 2 \t old flight number: " + f2.getFlightNumber());
	f2.setFlightNumber(49);
	System.out.println ("\t new flight number: " + f2.getFlightNumber());
	 
	}

	 
	}