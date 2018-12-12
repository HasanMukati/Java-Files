
public class  RetailitemTest{


	    public static void main(String [ ] args)
	{
	  
	   String str="Shirt";
	   Retailitem r1=new Retailitem("Jacket",12,59.95);
	   Retailitem r2=new Retailitem("Designer Jeans",40,34.95);
	   Retailitem r3=new Retailitem( );
	   r3.setDescription(str);
	   r3.setUnits(20);
	   r3.setPrice(24.95);
	System.out.println("\tDescription \tUnits on Hand  \tPrice");
	System.out.println("________________________________________________________");

	System.out.println("Item #1\t"+r1.getDescription( )+"\t\t"+r1.getUnits( )+" \t\t "+r1.getPrice( ));
	System.out.println("Item #2\t"+r2.getDescription( )+"\t"+r2.getUnits( )+" \t\t "+r2.getPrice( ));
	System.out.println("Item #3\t"+r3.getDescription( )+"\t\t"+r3.getUnits( )+" \t\t"+r3.getPrice( ));

	System.exit(0);
	}
	}