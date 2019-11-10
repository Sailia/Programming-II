import java.util.*;

public class ILoveEric {
   public static void main(String[] args) {
      
      WhoDoILove();
      
      
   }
   
   public static void WhoDoILove() {
      String love = "Eric";
      Scanner input = new Scanner(System.in);
      String name = "";
      boolean continueInput = true;
      
      do {
         try {
            System.out.println("Please enter a name: ");
            name = input.nextLine();
            
            if(!name.equals(love)) {
               throw new InputMismatchException("You're not my love, next!");
            }
            
            System.out.println("My love! Lets go drink some tea :)");
            continueInput = false;
         }
         catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
         }
      } while (continueInput);
   }
}