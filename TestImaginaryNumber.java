public class TestImaginaryNumber{
   public static void main(String[] args) {
      ImaginaryNumber num1 = new ImaginaryNumber(7, 3);
      ImaginaryNumber num2 = new ImaginaryNumber(7, -3);
      ImaginaryNumber num3 = new ImaginaryNumber(7, 3);
      
      num1.displayImaginaryNumber();
      num2.displayImaginaryNumber();
      num3.displayImaginaryNumber();
      
      System.out.println(num1.isIdentical(num2));
      System.out.println(num1.isIdentical(num3));
   }
}