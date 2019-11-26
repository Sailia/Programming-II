public class TVShow extends Video {
   private int numEpisodes, startYear;
   
   public TVShow(String title, int awardsWon, int numEpisodes, int startYear) {
      super(title, awardsWon);
      this.numEpisodes = numEpisodes;
      this.startYear = startYear;
   }
   
   public String toString() {
      return super.toString() + "Emmys won: " + super.getAwardsWon() + "\n" + "Number of Episodes: " + this.numEpisodes + "\n" + "Starting year: " + this.startYear;
   }
}