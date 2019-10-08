public class MiniString {
    private String str;

    public MiniString(String str) {
        this.str = str;
    }

    public String makeSubstring(int begin) {
        return this.str.substring(begin);
    }

    public String makeSubstring(int begin, int end) {
        return this.str.substring(begin, end);
    }

    public int findIndexOf(int ch) {
        return this.str.indexOf(ch);
    }

    public int findIndexOf(int ch, int fromIndex) {
        return this.str.indexOf(ch, fromIndex);
    }

    public int findIndexOf(String str) {
        return this.str.indexOf(str);
    }

    public int findIndexOf(String str, int fromIndex) {
        return this.str.indexOf(str, fromIndex);
    }
}