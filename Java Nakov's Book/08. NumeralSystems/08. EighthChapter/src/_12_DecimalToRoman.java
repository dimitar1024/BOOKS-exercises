import java.util.Scanner;


public class _12_DecimalToRoman {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Enter from interval [0...999]:");
        int number = Integer.parseInt(sc.nextLine());
		String[] onesStr = new String[] {"","I", "II", "III", "IV", "V", "VI", "VII","VIII","IX"};
        String[] tensStr = new String[] {"","","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] specialStr = new String[] {"X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX"};
        String[] hundss = new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; 
        int hunds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        if ((hunds == 0)&&(tens == 0))
        {
        	System.out.println(onesStr[ones]);
        }
        if ((hunds == 0)&&(tens == 1))
        {
        	System.out.println(specialStr[ones]);
        }
        if ((hunds == 0)&&(ones == 0))
        {
            System.out.println(tensStr[tens]);
        } 
        if ((hunds == 0) && (tens != 1))
        {
        	System.out.printf("%1$s%2$s",tensStr[tens],onesStr[ones]);
        }
        if ((hunds != 0) && (tens == 0) && (ones != 0))
        {
        	System.out.printf("%1$s%2$s", hundss[hunds], onesStr[ones]);
        }
        if ((hunds != 0) && (tens != 0) && (ones == 0))
        {
        	System.out.printf("%1$s%2$s ", hundss[hunds], tensStr[tens]);
        }
        if ((hunds != 0) && (tens != 0) && (ones != 0))
        {
        	System.out.printf("%1$s%2$s%3$s", hundss[hunds], tensStr[tens], onesStr[ones]);
        }
        if ((tens == 0)&&(ones == 0))
        {
        	System.out.printf("%1$s", hundss[hunds]);
        }

	}

}
