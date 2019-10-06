import java.math.BigInteger;

public class TwiceTheSum {
    public TwiceTheSum(String[] arr) {
        BigInteger sum = new BigInteger("0");
        BigInteger twiceSum = new BigInteger("2");

        for(int i = 0; i < arr.length; i++) {
            sum = sum.add(new BigInteger(arr[i]));
        }
        twiceSum = twiceSum.multiply(sum);
        System.out.println(twiceSum);
    }
}