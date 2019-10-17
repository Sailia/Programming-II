public class Digits
{
	public static void main(String[] args)
	{
      String s1 = "123";
      String s2 = "16.95";
      String s3 = "123G";
      String s4 = "-795";
      String s5 = "1M23";
      String s6 = "NEIU";
		System.out.println(s1 + " is a valid integer? " + hasOnlyDigits(s1));
      System.out.println(s2 + " is a valid integer? " + hasOnlyDigits(s2));
      System.out.println(s3 + " is a valid integer? " + hasOnlyDigits(s3));
      System.out.println(s4 + " is a valid integer? " + hasOnlyDigits(s4));
      System.out.println(s5 + " is a valid integer? " + hasOnlyDigits(s5));
      System.out.println(s6 + " is a valid integer? " + hasOnlyDigits(s6));
	}
   
   public static boolean hasOnlyDigits(String s)
	{
		return s.matches("^-{0,1}[0-9]*$");
	}
}