public class PhoneCard extends Card {
   private int idNumber;
   private double amount;
   
   public PhoneCard(int id, double amt) {
      super();
      this.idNumber = id;
      this.amount = amt;
   }
   
   @Override
   public void printInfo() {
      System.out.println("ID: " + this.idNumber);
      System.out.println("$" + this.amount);
   }
   
}