public class SeperateDuplicates
{
   public static void main(String[] args)
   {
      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));
   }
   
   public static String seperateDuplicatesChars(String str)
   {
      String hyphenated = "";
      for(int i = 1; i < str.length(); i++) {
         if(str.charAt(i) == str.charAt(i-1)) {
            hyphenated += str.charAt(i-1) + "-";
         } else {
            hyphenated += str.charAt(i-1);
         }
      }
      return hyphenated += str.charAt(str.length() - 1);
   }
}