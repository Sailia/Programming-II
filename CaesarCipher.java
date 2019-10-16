public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(CaesarCipher.encrypt("abc", 25));
    }


    public static String encrypt(String s, int d) {
        int index = s.charAt(0);
        String encrypted = "";
        encrypted += (char) index;
        
        for(int i = 1; i < s.length(); i++) {
            index = index + d;
            index = s.charAt(i);
            while(index > 122) {
                index = index - 122;
            }
            if(index < 97) {
                index = index + 97;
            }
            System.out.println(index);
            encrypted += (char) index;
            System.out.println(encrypted);
        }
        return encrypted;
    }
}