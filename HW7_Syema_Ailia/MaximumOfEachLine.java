import java.util.*;
import java.io.*;


public class MaximumOfEachLine {
   public static void main(String[] args) {
      File f = new File("data.txt");
      try {
         Scanner input = new Scanner(f);
         
         while(input.hasNext()) {
            int largest = 0;
            String[] arr = input.nextLine().split(" ");
            String firstName = arr[0];
            String lastName = arr[1];
         
            for(int i = 2; i < arr.length; i++) {
               int number = Integer.parseInt(arr[i]);
               
               if(number > largest) {
                  largest = number;
               }
            }
            System.out.println(firstName + " " + lastName + " " + largest);
         }
         input.close();
      } catch(FileNotFoundException ex) {
         System.out.println("File not found");
      }
   }
}