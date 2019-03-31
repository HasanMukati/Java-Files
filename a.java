package a;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class a { 
	

	public static void main (String[] args) {
		
		// declaring how the out put should be, what type and how many decimals
		
		String output ="";
		DecimalFormat df = new  DecimalFormat ("##.###");
		while  (true) {
	
		// declaring/parsing all values and asking user to input all the numbers
			
		double a = Double.parseDouble(JOptionPane.showInputDialog("\nEnter Coefficient  of X for first equation"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("\nEnter Coefficient  of Y for first equation"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("\nEnter Coefficient Value for first equation"));
		
		double d = Double.parseDouble(JOptionPane.showInputDialog("\nEnter Coefficient  of X for second equation"));
		double e = Double.parseDouble(JOptionPane.showInputDialog("\nEnter Coefficient  of Y for second equation"));
		double f = Double.parseDouble(JOptionPane.showInputDialog("\nEnter Coefficient  Value for second equation"));
		
		//using the inputed numbers, this displayed the equation in the correct manner
		
		output += "\nThe  two linear equations are: \n";
		output += "\n" + a + "X   + "+ b + "Y = "+ e;
		output += "\n" + c + "X   + "+ d + "Y = "+ f;
		
		//formula for solving Cramer's Rule" 
		
		output += "\nUsing Cramer's Rule: ";
		double x = ((e*d) - (b*f)) / ( (a*d) - (b*c));
		double y = ((a*f) - (e*c)) / ( (a*d) - (b*c));
		
		//correctly outputs the X and Y value with Decimal  format 
		output += "\n X =   " + df.format(x);
		output += "\n Y =   " + df.format(y);
		JOptionPane.showInputDialog(null, output);
		}	
} 
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	