public class Movie extends Video {
   private int length;
   private String director;
   
   public Movie(String title, int awardsWon, int length, String director) {
      super(title, awardsWon);
      this.length = length;
      this.director = director;
   }
   
   @Override
   public String toString() {
      return super.toString() + "Oscars won: " + super.getAwardsWon() + "\n" + "Length in minutes: " + this.length + "\n" + "Director: " + this.director;
   }
}