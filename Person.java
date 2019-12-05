public abstract class Person {
   private String first;
   private String last;
   
   protected Person(String f, String l) {
      this.first = f;
      this.last = l;
   }
   
   public abstract void printInfo();
   
   public String toString() {
      return (this.first + " " + this.last);
   }
}