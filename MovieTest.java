import java.util.Scanner;
public class MovieTest 
{

	public static void main(String[] args) {
	       Movie m1 = new Movie();
	       Movie m2 = new Movie();
	      
	       m1.setMovieName("Lord Of the Rings");
	       m1.setMPAARating("PG-13");
	      
	       m1.addRating(5);
	       m1.addRating(4);
	       m1.addRating(4);
	       m1.addRating(1);
	       m1.addRating(3);
	      
	       m2.setMovieName("Titanic");
	       m2.setMPAARating("R");
	      
	       m2.addRating(2);
	       m2.addRating(1);
	       m2.addRating(2);
	       m2.addRating(1);
	       m2.addRating(3);
	      
	       System.out.println("Details of movie 1:");
	       System.out.println("Movie Name:"+m1.getMovieName());
	       System.out.println("MPAA rating:"+m1.getMPAARating());
	       System.out.println("Average Rating:"+m1.getAverage());
	       System.out.println();
	       System.out.println("Details of movie 2:");
	       System.out.println("Movie Name:"+m2.getMovieName());
	       System.out.println("MPAA rating:"+m2.getMPAARating());
	       System.out.println("Average Rating:"+m2.getAverage());
	       System.out.println();
	   }
	}

