public class SumOfDiagonals
{
   public static void main(String[] args)
   {

      String[][] s1 = {{"2", "3", "4"},
                       {"5", "6", "7"},
                       {"8", "9", "10"}};

      String[][] s2 = {{"1", "2", "3"},
                       {"5", "6", "7"},
                       {"9", "10", "11"},
                       {"13", "14", "15"}};
                       
      String[][] s3 = {{"1", "2", "3", "4"},
                       {"5", "6", "7", "8"},
                       {"9", "10", "11", "12"},
                       {"13", "14", "15", "16"}};
      try
      {
         sumOfDiagonals(s1);
         //sumOfDiagonals(s2);
         sumOfDiagonals(s3);
      }
      catch(NumberFormatException ex)
      {
         System.out.println("Not a valid integer");
      }
      catch(IllegalArgumentException ex)
      {
         System.out.println("Array not a square");
      }
   }

   public static void sumOfDiagonals(String[][] x)
   {
      //TODO Complete this method as required in the homework instructions
      
      /*
      [[1,2,3,6],
       [4,5,6,8],
       [7,8,9,4]
       [7,8,9,4]]
      */
      
      int count = 0, add = 0;
      boolean square = true;
      
      for(int i = 0; i < x.length; i++) {
         if(x[i].length != x.length) {
            count++;
         }
      }
      
      if(count > 0) {
         square = false;
      }
      
      if(square == false) {
         throw new IllegalArgumentException();
      }
      
      for(int i = 0; i < x.length; i++) {
         for(int j = 0; j < x[i].length; j++) {
            Integer.parseInt(x[i][j]);
         }
      }
      
      count = 0;
      
      for(int i = 0; i < x.length; i++) {
         add += Integer.parseInt(x[i][count]);
         count++;
      }
      
      System.out.println(add);
   }
}