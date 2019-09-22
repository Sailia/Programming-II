import java.math.BigInteger;

public class TwiceTheSumTest {   
   public static void main(String[] args)  {
      String[] a = {"1", "4", "3", "8"};
      twiceTheSum(a);
      String[] b = {"132", "289", "893", "1", "839", "56"};
      twiceTheSum(b);
      String[] c = {"857882923723748", "8493849384340394920", "483948454982399"};
      twiceTheSum(c);
   }
   
      public static void twiceTheSum(String[] arr) {
      BigInteger num = new BigInteger("0");
      BigInteger sum = new BigInteger("0");
      BigInteger two = new BigInteger("2");
      
      for(int i = 0; i < arr.length; i++) {
         num = num.add(new BigInteger(arr[i]));
      }
      
      sum = num.multiply(two);
      System.out.println(sum);
   }
}