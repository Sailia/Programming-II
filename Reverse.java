public class Reverse
{
   public static void main(String[] args)
   {
      
      System.out.println(isExactReverse("ba", "a"));
      System.out.println(isExactReverse("desserts", "stressed"));
      System.out.println(isExactReverse("apple", "apple"));
      System.out.println(isExactReverse("regal", "lager"));
      System.out.println(isExactReverse("war", "raw"));
      System.out.println(isExactReverse("pal", "slap"));
      

   }
   public static boolean isExactReverse(String x, String y)
   {
      int count = 1, length = y.length() - 1;

      for(int i = 0; i < y.length() - 1; i++) {
         if(x.charAt(i) == y.charAt(length)) {
            count++;
            
         }
         length--;
      }
      return x.length() == count;
   }

}