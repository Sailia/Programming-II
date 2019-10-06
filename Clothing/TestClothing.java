public class TestClothing
{
   public static void main(String[] args)
   {
      Clothing clt1 = new Clothing();

      clt1.details();
      clt1.increasePrice();
      clt1.details();
      clt1.increasePrice(7);
      clt1.details();

      Clothing clt2 = new Clothing(31.2, "Jeans", "Small");

      clt2.details();
      clt2.increasePrice();
      clt2.increasePrice();
      clt2.details();
      clt2.increasePrice(4);
      clt2.details();
   }
}

class Clothing {
   private double price;
   private String size, type;
   
   Clothing() {
      this.price = 29.9;
      this.type = "T-Shirt";
      this.size = "Medium";
   }
   
   Clothing(double price, String type, String size) {
      this.price = price;
      this.type = type;
      this.size = fries;
   }
   
   public void increasePrice() {
      this.price += 5;
   }
   
   public void increasePrice(double x) {
      this.price = x;
   }
   
   public void details() {
      System.out.println("Item: " + this.price);
      System.out.println("Type: " + this.type);
      System.out.println("Size: " + this.size);
      System.out.println();
   }
}