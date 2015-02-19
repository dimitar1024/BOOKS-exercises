import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _09_TranslateNumberInString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter from interval [0...999]:");
        int number = Integer.parseInt(bf.readLine());
		String[] onesStr = new String[] {"zero","one", "two", "three", "four", "five", "six", "seven","eight","nine"};
        String[] tensStr = new String[] {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        String[] specialStr = new String[] {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
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
        	System.out.printf("%1$s-%2$s",tensStr[tens],onesStr[ones]);
        }
        if ((hunds != 0) && (tens == 0) && (ones != 0))
        {
        	System.out.printf("%1$s hundred and %2$s", onesStr[hunds], onesStr[ones]);
        }
        if ((hunds != 0) && (tens != 0) && (ones == 0))
        {
        	System.out.printf("%1$s hundred and %2$s ", onesStr[hunds], tensStr[tens]);
        }
        if ((hunds != 0) && (tens != 0) && (ones != 0))
        {
        	System.out.printf("%1$s hundred and %2$s-%3$s", onesStr[hunds], tensStr[tens], onesStr[ones]);
        }
        if ((tens == 0)&&(ones == 0))
        {
        	System.out.printf("%1$s hundred", onesStr[hunds]);
        }
	}

}