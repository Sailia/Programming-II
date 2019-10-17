public class SortingStrings {
    public static void main(String[] args) {
        SortingWords("BeesAreLookingAtYou");
    }
    public static void SortingWords(String s) {
        int capitals = 0;
        for(int i = 0; i < s.length(); i++) {
            String letterString = Character.toString(s.charAt(i));
            if(letterString.matches("[A-Z]")) {
                capitals++;
            }
        }
        System.out.println(capitals);
        // String[] array = s.split("A-Z", " ");

        // for(int i = 0; i < array.length; i++) {
        //     System.out.print(array[i] + " ");    
        // }
    }
}