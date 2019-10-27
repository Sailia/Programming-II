public class TestBuilding {
   public static void main(String[] args) {
      Building b1 = new Building("5500 N St. Louis Ave Chicago, IL 60625", 3, true);
      System.out.println(b1.toString());
      System.out.println();
      
      Building b2 = new Apartment("1711 N Milwaukee Ave, Chicago, IL 60647", 4, false, "2A");
      System.out.println(b2.toString());
   }
}