public class VideoTest {
   public static void main(String[] args) {
      Video[] vid = new Video[3];
      vid[0] = new TVShow("M*A*S*H", 14, 251, 1972);
      vid[1] = new Movie("Casablanca", 3, 102, "Michael Curtis");
      vid[2] = new TVShow("Seinfeld", 10, 173, 1989);
      
      for(int i = 0; i < vid.length; i++) {
         String vidArr = (String) vid[i].toString();
         System.out.println(vidArr);
         System.out.println();
      }
   }
}