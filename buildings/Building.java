public class Building {
   private String address;
   private int nbrOfFloors;
   private boolean garage;
   
   public Building(String add, int nFloors, boolean garage) {
      this.address = add;
      this.nbrOfFloors = nFloors;
      this.garage = garage;
   }
   
   @Override
   public String toString() {
      String add = (String) ("Address: " + this.address);
      String nfloors = (String) ("Number of floors: " + this.nbrOfFloors);
      String yesNo;
      
      yesNo = this.garage == true ? "Yes" : "No";
      
      return add + "\n" + nfloors + "\n" + "Garage: " + yesNo;
   }

}