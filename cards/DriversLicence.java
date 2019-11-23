import java.time.LocalDate;
import java.time.LocalDateTime;

public class DriversLicence extends Card  {
   private int idNumber, expYear, expMonth, expDay;
   
   public DriversLicence(String name, int id, int expY, int expM, int expD) {
      super(name);
      this.idNumber = id;
      this.expYear = expY;
      this.expMonth = expM;
      this.expDay = expD;
   }
   
   @Override 
   public boolean isExpired() {
      LocalDate currentDate = LocalDate.now();
      int dom = currentDate.getDayOfMonth();
      int m = currentDate.getMonthValue();
      int y = currentDate.getYear();
      boolean expired = false;
      
      if(this.expYear > y) {
         expired = true;
      } else if(this.expYear == y && m > this.expMonth) {
         expired = true;
      } else if(this.expYear == y && m == this.expMonth && dom > this.expDay) {
         expired = true;
      }
      return expired;

   }
   
   @Override
   public void printInfo() {
      System.out.println("Name: " + this.name);
      System.out.println("ID: " + this.idNumber);
      System.out.println("Expiration: " + this.expMonth + "/" + this.expDay + "/" + this.expYear);
   }
   
   
}