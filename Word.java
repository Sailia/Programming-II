public class Word extends Sentence {
   private String noVowelsWord;
   
   public Word(String s, String w) {
      super(s);
      this.noVowelsWord = w.replaceAll("[AEIOUaeiou]", "");
   }
   
   public String getNoVowelsWord() {
      return this.noVowelsWord;
   }
   
   public boolean isSubstring() {
      boolean sub = false;
      String sen = (String) super.getSentence();
      
      if(sen.matches("(.*)this.noVowelsWord(.*)")) {
         sub = true;
      }
      return sub;
   }
}