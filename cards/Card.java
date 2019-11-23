public class Card {
    public String name;

    public Card() {
        //Didn't know what to set the defualt to, so i put it N/A
    }
    public Card(String name)  {
        this.name = name;
    }
    //Also a little bit unsure about this method's parameters.
    public boolean isExpired()   {
        return false;
    }
    public void printInfo()   {
        System.out.println(this.name);
    }
}