import java.util.Scanner;


public class _02_BinaryToHexAndDecimal {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String input = sc.nextLine();
		int decimal = BinaryToDecimal(input);
		String hexdecimal = DecimalToHex(decimal);
		
		System.out.println(input);
		System.out.println(decimal);
		System.out.println(hexdecimal);
	}
	
	public static int BinaryToDecimal(String bin){
		
		int decimal = 0;
		
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '0') {
				continue;
			}
			decimal += Math.pow(2, i);
		}

		return decimal;
	}
	
	public static String DecimalToHex(int decimal){
		String hex = "";
		int bit = 0;
		
		while (decimal > 0) {
			bit = decimal%16;
			decimal = decimal/16;
			
			switch (bit) {
			case 0:
				hex = "0" + hex;
				break;
			case 1:
				hex = "1" + hex;
				break;
			case 2:
				hex = "2" + hex;
				break;
			case 3:
				hex = "3" + hex;
				break;
			case 4:
				hex = "4" + hex;
				break;
			case 5:
				hex = "5" + hex;
				break;
			case 6:
				hex = "6" + hex;
				break;
			case 7:
				hex = "7" + hex;
				break;
			case 8:
				hex = "8" + hex;
				break;
			case 9:
				hex = "9" + hex;
				break;
			case 10:
				hex = "A" + hex;
				break;
			case 11:
				hex = "B" + hex;
				break;
			case 12:
				hex = "C" + hex;
				break;
			case 13:
				hex = "D" + hex;
				break;
			case 14:
				hex = "E" + hex;
				break;
			case 15:
				hex = "F" + hex;
				break;
			
			}
		}
		return hex; 
	}

}
