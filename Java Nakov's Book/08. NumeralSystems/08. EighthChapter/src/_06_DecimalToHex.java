import java.util.Scanner;


public class _06_DecimalToHex {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        long decimalInput = sc.nextLong();
		String hexNumber = "";

        if (decimalInput == 0)
        {
            hexNumber = "0";
        }
        else
        {
            while (decimalInput > 0)
            {
                int numNow = (int)decimalInput % 16;
                decimalInput = decimalInput / 16;

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
