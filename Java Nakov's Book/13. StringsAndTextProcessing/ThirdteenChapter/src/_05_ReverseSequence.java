import java.util.Scanner;


public class _05_ReverseSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		sc.close();
		String[] inputToArray = input.split("[ ,.]");
		String[] reverse = new String[inputToArray.length];
		for (int i = 0; i < inputToArray.length; i++) {
			reverse[i] = inputToArray[inputToArray.length -i-1];
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < reverse.length; i++) {
			sb.append(reverse[i]);
			sb.append(" ");
		}
		String exit = sb.toString();
		System.out.println(exit);
	}

}
