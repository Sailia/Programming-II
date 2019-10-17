public class BinaryInverter
{
   public static void main(String[] args)
   {
      String s1 = "10010111";
      System.out.println("The invert of " + s1 + " is " + invert(s1));
      System.out.println();

      String s2 = "01011010010111010010";
      System.out.println("The invert of " + s2 + " is " + invert(s2));
      System.out.println();
      
      String s3 = "101";
      System.out.println("The invert of " + s3 + " is " + invert(s3));
      System.out.println();
   }
   
   public static String invert(String str)
   {
      String inverted = str.replace("0", "Z");
      inverted = inverted.replace("1", "O");
      inverted = inverted.replace("Z", "1");
      inverted = inverted.replace("O", "0");

      return inverted;
   }
}