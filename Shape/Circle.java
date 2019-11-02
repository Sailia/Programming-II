public class Circle extends Shape {
   private double radius;
   
   public Circle() {
      this.radius = 1;
   }
   
   public Circle(double radius) {
      this.radius = radius;
   }
   
   public Circle(double radius, boolean isFilled, String color) {
      super(isFilled, color);
      this.radius = radius;
   } 
   
   public double getArea() {
      double area = (this.radius * this.radius) * Math.PI;
      return area;
   }
   
   @Override
   public String toString() {
      String shape = super.toString();
      String area = (String) ("Area: " + getArea());
      String radius = (String) ("Radius: " + this.radius);
      return radius + "\n" + area + "\n" + shape;
   }
   
}