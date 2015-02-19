
import java.util.Scanner;


public class _09_BinaryToHex {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
	
		String bin = sc.nextLine();
		int decimal = 0;
		int len = bin.length();
		for (int i = 0; i < len; i++) {
			if (bin.charAt(len-i-1) == '0') {
				continue;
			}
			decimal += Math.pow(2, i);
		}
		
		System.out.println(decimal);
		
		String hexNumber = "";

        if (decimal == 0)
        {
            hexNumber = "0";
        }
        else
        {
            while (decimal > 0)
            {
                int numNow = decimal % 16;
                decimal = decimal / 16;

                switch (numNow)
                {
                    case 10: hexNumber = 'A' + hexNumber; break;
                    case 11: hexNumber = 'B' + hexNumber; break;
                    case 12: hexNumber = 'C' + hexNumber; break;
                    case 13: hexNumber = 'D' + hexNumber; break;
                    case 14: hexNumber = 'E' + hexNumber; break;
                    case 15: hexNumber = 'F' + hexNumber; break;

                    default: hexNumber = numNow + hexNumber; break;
                }
            }
            System.out.println("0x" + hexNumber);
        }

		
	}
}