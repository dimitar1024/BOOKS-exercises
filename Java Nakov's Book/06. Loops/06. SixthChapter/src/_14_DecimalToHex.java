import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _14_DecimalToHex {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int decimal = Integer.parseInt(bf.readLine());
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
		System.out.println("0x" + hex);
	}

}
