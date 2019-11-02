public class Rectangle extends Shape {
   private double width, length;
   
   public Rectangle() {
      this.length = 2;
      this.width = 1;
      setLW(this.length, this.width);
   }  
   
   public Rectangle(double width, double length) {
      this.length = length;
      this.width = width;
      setLW(length, width);
   }
   
   public Rectangle(double width, double length, boolean isFilled, String color) {
      super(isFilled, color);
      this.length = length;
      this.width = width;
      setLW(length, width);
   }
   
   public void setLW(double x, double y) {
      this.length = Math.max(x, y);
      this.width = Math.min(x, y);
   }
   
   public String getArea() {
      double a = this.length * this.width;
      String area = Double.toString(a);
      return (String) "Area: " + area;
   }
   
   @Override
   public String toString() {
      String width = (String) ("Width: " + this.width);
      String length = (String) ("Length: " + this.length);
      String area = (String) getArea();
      String shape = super.toString();
      
      return width + "\n" + length + "\n" + area + "\n" + shape;
   }
   
   
}