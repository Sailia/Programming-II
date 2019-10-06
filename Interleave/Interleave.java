public class Interleave {
   public static void main(String[] args) {
      int[] a = {1, 2, 3};
      int[] b = {44, 55, 66, 77, 88};

      int[] c = {40, 30, 60, 80, 70};
      int[] d = {5, 2};
      
      int[] e = {7, 8, 9};
      int[] f = {33, 22, 11};

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
   }//End of main() method


   //interleave method
   public static int[] interleave(int[] x, int[] y) { //this method is so ugly....
      int count = 0, countTwo = 0;
      int newArrayLength = x.length + y.length;
      int[] finalArray = new int[newArrayLength];
     
      for(int i = 0; i < finalArray.length; i++) {
         if(i % 2 == 0 && x.length > count) {
            finalArray[i] = x[count];
            count++;
         } else if (y.length > countTwo) {
            finalArray[i] = y[countTwo];
            countTwo++;
         } else if (y.length > x.length) {
            finalArray[i] = y[countTwo];
            countTwo++;
         } else {
            finalArray[i] = x[count];
            count++;
         }
      }
      
      return finalArray;
   }//End of interleave

   public static void displayArray(int[] array) {
      for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
   }//End of displayArray() method
}