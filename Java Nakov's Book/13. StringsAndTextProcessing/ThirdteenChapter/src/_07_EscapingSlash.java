import java.util.Arrays;
import java.util.Scanner;


public class _07_EscapingSlash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		sc.close();
		String[] data = input.split("\\\\");
		
		String exit = Arrays.toString(data);
		System.out.println(exit);
	}

}