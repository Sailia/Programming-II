public class Sentence {
   private String sentence;
   
   public Sentence(String sentence) {
      this.sentence = sentence;
   }
   
   public String getSentence() {
      return this.sentence;
   }
   
   @Override
   public boolean equals(Object other) {
      boolean eq = false;
      
      if(other == null) {
         eq = false;
      } else if(this.getClass() != other.getClass()) {
         eq = false;
      } else {
         eq = this.sentence.equals(other);
      }
      return eq;
   }
}