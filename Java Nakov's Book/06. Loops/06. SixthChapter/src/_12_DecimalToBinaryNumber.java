import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _12_DecimalToBinaryNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(bf.readLine());
		String bin = "";
		int bit = 0;
		
		while (number>0) {
			bit = number%2;
			number = number/2;
			bin = bit + bin;
		}
		System.out.println(bin);
	}

}
