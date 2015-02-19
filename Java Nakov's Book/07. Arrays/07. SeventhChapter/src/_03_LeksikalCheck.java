import java.util.Scanner;


public class _03_LeksikalCheck {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		String first = in.nextLine();
		String two = in.nextLine();
		
		char[] firstToChar= first.toCharArray();
		char[] twoToChar= two.toCharArray();
		int i = 0;
		int j = 0;
		boolean isEqual= false;
		
		while (i < firstToChar.length && j < twoToChar.length ) {
			if (firstToChar[i] > twoToChar[j]) {
				System.out.println(two);
				isEqual = false;
				break;
			}
			else if (firstToChar[i] < twoToChar[j]) {
				System.out.println(first);
				isEqual = false;
				break;
			}
			else {
				isEqual = true;
			}
			
			i++;
			j++;
		}
		
		if (isEqual == true) {
			if (firstToChar.length < twoToChar.length) {
				System.out.println(first);
			}
			else if(firstToChar.length > twoToChar.length ) {
				System.out.println(two);
			}
			else {
				System.out.println("No difference");
			}
		}

	}

}
