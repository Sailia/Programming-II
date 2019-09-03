public class Interleave
{
   public static void main(String[] args)
   {
      int[] a = {1, 2, 3};
      int[] b = {44, 55, 66, 77, 88};

      int[] c = {40, 30, 60, 80, 70};
      int[] d = {5, 2};
      
      int[] e = {7, 8, 9};
      int[] f = {33, 22, 11};

      /*
      System.out.println("Output: ");
      int[] outputArray = interleave(a, b);
      displayArray(outputArray);
      System.out.println();

      int[] outputArray2 = interleave(c, d);
      displayArray(outputArray2);
      System.out.println();

      int[] outputArray3 = interleave(e, f);
      displayArray(outputArray3);
      System.out.println();
      */
   }//End of main() method


   //interleave method
   public static int[] interleave(int[] x, int[] y)
   {
      //Complete this method as required in the homework description.
      
      
      
   }//End of interleave

   public static void displayArray(int[] array)
   {
      for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
   }//End of displayArray() method
}