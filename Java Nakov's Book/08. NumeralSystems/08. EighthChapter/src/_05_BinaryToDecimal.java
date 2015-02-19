import java.util.Scanner;


public class _05_BinaryToDecimal {

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
	}
}
