import java.util.Scanner;


public class _04_DecimalToBinary {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int number = sc.nextInt();
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
