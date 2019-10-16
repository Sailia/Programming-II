public class Decimals {

    public static void printDecimalDigits(double dec) {
        String s = dec + "";
        int index = s.indexOf('.');
        String rem = s.substring(index + 1);
        System.out.println(rem);
    }
}