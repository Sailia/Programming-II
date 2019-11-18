public class Video {
   private String title;
   private int awardsWon;
   
   public Video(String title, int awardsWon) {
      this.title = title;
      this.awardsWon = awardsWon;
   }
   
   @Override
   public String toString() {
      return "Title: " + this.title + "\n";
   }
   
   public int getAwardsWon() {
      return this.awardsWon;
   }
}