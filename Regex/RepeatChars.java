public class RepeatChars
{
   public static void main(String[] args)
   {
      /* 
      -The method takes a String x as a parameter and returns a new String.
      -The new String should have any vowels in x repeated twice, and any other character in x repeated 3 times.
      -You may use one loop at the most.
      -You may use one conditional (if) statement at the most, and it can’t have an (else) or (else-if) blocks. 
      */

      System.out.println(repeatChars("easy!!"));
      System.out.println(repeatChars("abc"));
      System.out.println(repeatChars("apple7"));
      System.out.println(repeatChars("Homework"));
      System.out.println(repeatChars("Integer"));
   
   }
   public static String repeatChars(String x)
   {
      String word = "";
      
      //Grab the first letter of the string 
      //if it is a vowel
      //    append it twice to a new string 
      String letter;
      for(int i = 0; i < x.length(); i++) {
         letter = (x.charAt(i) + "");
         word += letter + letter;

         if(letter.matches("[^aeiouAEIOU]+$")) {
            word += letter;
         }
      }
      return word;
   }
}