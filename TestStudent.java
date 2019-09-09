public class TestStudent
{
   public static void main(String[] args)
   {
      Student s1 = new Student(3343, "John Smith", "CS", 3.85);
      s1.studentInfo();
      System.out.println();

      Student s2 = new Student(2398, "Sam Johnson", "Math", 3.25);
      s2.studentInfo();
   }
}