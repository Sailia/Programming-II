public class ImaginaryNumber {
   private int real, imaginary;
   
   ImaginaryNumber(int real, int imaginary) {
      this.real = real;
      this.imaginary = imaginary;
   }  
   
   public int getReal() {
      return this.real;
   }
   
   public int getImaginary() {
      return this.imaginary;
   }
   
   public void displayImaginaryNumber() {
      if(this.imaginary < 0) {
         System.out.println(this.real + " - " + Math.abs(this.imaginary) + "i");
      } else {
         System.out.println(this.real + " + " + this.imaginary + "i");
      }
   }
   
   public boolean isIdentical(ImaginaryNumber imaginary) {
      int i = imaginary.getImaginary(), r = imaginary.getReal();
      return this.imaginary == i && this.real == r;
   }
}