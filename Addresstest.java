public class Addresstest {
	
	

	public static void main(String args[])

{

     Address add1= new Address(200,"E Fairfax",  "Falls Church","VA",22046);
     Address add2= new Address(9811,"W Cresence",  "Fairfax","VA",22032);

     if(add1.comesBefore(add2))
     {
         System.out.println("Address 1:");
         add1.print();
         System.out.println("Address 2:");
         add2.print();
     }
     else
     {
         System.out.println("Address 2:");
         add2.print();
         System.out.println("Address 1:");
         add1.print();     

     }
}

}