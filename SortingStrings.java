import java.util.Arrays;
import java.util.ArrayList;

public class SortingStrings {
    public static void main(String[] args) {
        SortingWords("BeesAreLookingAtYou");
    }
    
    public static void SortingWords(String s) {
        String[] split = s.split("(?=[A-Z])");
        String[] sortedSplit = new String[split.length];
        String smallest = "";
        int count = 0, smallestIndex = 0;
        
        //write code to find the first word in the array thats not a hyphen************
        while(count < sortedSplit.length) {
            
            // Find a starting "smallest" to compare other words with
            for(int j = 0; j < split.length; j++) {
                if(split[j] != "_") {
                    smallest = split[j];
                    smallestIndex = j;
                }
            }

            for(int i = 0; i < split.length; i++) {
                //save the next element to smallest thats not an underscore
                if(smallest.length() > split[i].length() && split[i].matches("_") == false) {
                    smallest = split[i];
                    smallestIndex = i;
                }

            }
            sortedSplit[count] = smallest;
            System.out.print(sortedSplit[count] + " ");
            count++;
            // I need to put an underscore in the place where the smallest word existed in the split array
            split[smallestIndex] = "_";
        }    
        System.out.println();
    }
    
}