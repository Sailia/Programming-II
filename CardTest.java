public class CardTest
{
	public static void main(String[] args)
	{
		Card[] c = new Card[4];
		c[0] = new DriversLicence("Ada Lovelace", 1458392, 2010, 10, 10);
		c[1] = new DriversLicence("Satoshi Nakamoto", 48201048, 2025, 4, 5);
		c[2] = new DriversLicence("Hedy Lamarr", 193801938, 2021, 11, 9);
		c[3] = new PhoneCard(998738201, 25.01);
		
		for (int i = 0; i < c.length; i++)
		{
			c[i].printInfo();
			boolean exp = c[i].isExpired();
            if(exp)
			    System.out.println("Expired: yes");
            else
                System.out.println("Expired: no");
			System.out.println();
		}
	}
}