import java.io.*;
import java.util.Scanner;

public class Retailitem {

     String description;
     int units;
     double price;
     Retailitem() {       
     }
     Retailitem(String x, int y, double z)
{
          description = x;
          units = y;
          price = z;
     }
     public void setDescription(String x)
     {
          description = x;
     }
     public void setPrice(double z) {
          price = z;
     }
     void setUnits(int y) {
          units = y;
     }
     public int getUnits()
     {
          return units;
     }
     public String getDescription()
     {
          return description;
     }
     public double getPrice()
     {
          return price;
     }
}
