public class Movie {
   private String movieName;
   private String MPAARating;
   private int numOfPerRated1;
   private int numOfPerRated2; 
   private int numOfPerRated3; 
   private int numOfPerRated4; 
   private int numOfPerRated5; 
   Movie() {
       numOfPerRated1 = 0;
       numOfPerRated2 = 0;
       numOfPerRated3 = 0;
       numOfPerRated4 = 0;
       numOfPerRated5 = 0;
   }

   public String getMovieName() {
       return movieName;
   }

   public void setMovieName(String movieName) {
       this.movieName = movieName;
   }

   public String getMPAARating() {
       return MPAARating;
   }

   public void setMPAARating(String mPAARating) {
       MPAARating = mPAARating;
   }

   public void addRating(int x) {
       if (x == 1) {
           numOfPerRated1++;
       } else if (x == 2) {
           numOfPerRated2++;
       } else if (x == 3) {
           numOfPerRated3++;
       } else if (x == 4) {
           numOfPerRated4++;
       } else if (x == 5) {
           numOfPerRated5++;
       } else {
           System.out.println("Invalid rating value.");
       }
   }

   public double getAverage() {
       return ((numOfPerRated1 * 1) + (numOfPerRated2 * 2) + (numOfPerRated3 * 3) + (numOfPerRated4 * 4)
               + (numOfPerRated5 * 5)) / 5.0; // weighted average of the rating
   }}