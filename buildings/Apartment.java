public class Apartment extends Building {
   private String apartmentNumber;
   
   public Apartment(String add, int nFloors, boolean garage, String aptN) {
      super(add, nFloors, garage);
      this.apartmentNumber = aptN;
   }
   
   @Override
   public String toString() {
      String b = super.toString();
      String apt = (String) ("Apartment Number: " + this.apartmentNumber);
      
      return b + "\n" + apt;
   }
   
}