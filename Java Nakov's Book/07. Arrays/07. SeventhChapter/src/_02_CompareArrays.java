import java.util.Scanner;


public class _02_CompareArrays {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		String one = input.nextLine().trim();
		String two = input.nextLine().trim();
		
		String[] oneToArray = one.split(" ");
		String[] twoToArray = two.split(" ");
		
		int[] oneToInt = new int[oneToArray.length];
		for (int i = 0; i < oneToInt.length; i++) {
			oneToInt[i] = Integer.parseInt(oneToArray[i]);
		}
		int[] twoToInt = new int[twoToArray.length];
		for (int j = 0; j < twoToInt.length; j++) {
			twoToInt[j] = Integer.parseInt(twoToArray[j]);
		}
		
		int countToEqual = 0;
		if (oneToInt.length != twoToInt.length) {
			System.out.println("false");
		}
		else {
			for (int i = 0; i < oneToInt.length; i++) {
				if (oneToInt[i] == twoToInt[i]) {
					countToEqual++;
				}
			}
			
			if (countToEqual == oneToArray.length) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
		
	}

}
