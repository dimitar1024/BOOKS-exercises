import java.util.Scanner;


public class _11_RomanToArabic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String roman = sc.nextLine();
		char[] rome = roman.toCharArray();
		int value  =0;
		for (int i = 0; i < rome.length; i++) {
			int j = i+1;
			// ne e dovar6enaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		}

	}
	
	public static int CharPlusValue(char c) {
		int sum =0;
		switch (c) {
		case 'i':
			sum += 1;
			break;
		case 'v':
			sum += 5;
			break;
		case 'x':
			sum += 10;
			break;
		case 'l':
			sum += 50;
			break;
		case 'c':
			sum += 100;
			break;
		case 'd':
			sum += 500;
			break;
		case 'm':
			sum += 1000;
			break;
		}
		return sum;
	}
	
	public static int CharMinusValue(char c) {
		int sum =0;
		switch (c) {
		case 'i':
			sum -= 1;
			break;
		case 'v':
			sum -= 5;
			break;
		case 'x':
			sum -= 10;
			break;
		case 'l':
			sum -= 50;
			break;
		case 'c':
			sum -= 100;
			break;
		case 'd':
			sum -= 500;
			break;
		case 'm':
			sum -= 1000;
			break;
		}
		return sum;
	}

}
