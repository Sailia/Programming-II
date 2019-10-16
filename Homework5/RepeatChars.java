public class RepeatChars
{
   public static void main(String[] args)
   {
      System.out.println(repeatChars("easy!!"));
      System.out.println(repeatChars("abc"));
      System.out.println(repeatChars("apple7"));
      System.out.println(repeatChars("Homework"));
      System.out.println(repeatChars("Integer"));
   
   }
   public static String repeatChars(String x)
   {
      String repeated = "";
      for(int i = 0; i < x.length(); i++) {
         if(x(i).matches(".*[aeiouAEIOU].*")) {
            repeated += x(i)
         } 
      }
      return x;
      
   }
}