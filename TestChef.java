public class TestChef {
   public static void main(String[] args) {
      Chef c1 = new Chef("Jamie", "Oliver");
      String[] a = c1.createSkills(3);
      System.out.println();
      c1.printInfo();
      System.out.println();
      c1.printSkills(a);
      System.out.println();
      Chef c2 = new Chef("Gordon", "Ramsey");
      String[] b = c2.createSkills(2);
      System.out.println();
      c2.printInfo();
      System.out.println();
      c2.printSkills(b);
   }
} 