import java.util.*;

public class Chef extends Person implements ISkills {
   public Chef(String first, String last) {
      super(first, last);
   }
   
   public String toString() {
      return "I am a chef";
   }
   
   public void printInfo() {
      System.out.println( super.toString() + " " + this.toString());
   }
   
   public String[] createSkills(int n) {
      String[] arr = new String[n];
      Scanner input = new Scanner(System.in);
      
      for(int i = 0; i < arr.length; i++) {
         System.out.println("Enter skill: ");
         arr[i] = input.nextLine();
      }
      return arr;
   } 
   
   public void printSkills(String[] s) {
      System.out.println("My skills are:");
      
      for(int i = 0; i < s.length; i++) {
         System.out.println(s[i]);
      }
   }
}