import java.util.Scanner;


public class _05_SequenceOfUpValueElements {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] numStr = input.split(",");
		
		int[] numbers = new int[numStr.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numStr[i] = numStr[i].trim();
			numbers[i] = Integer.parseInt(numStr[i]);
		}
		
		int counter = 0;
		int maxSequence = 0;
		int index = 0;
		
		for (int i = 0; i < numbers.length-1; i++) {
			counter = 0;
			int j = i+1;
			int k = i;
			
			while (numbers[k]<numbers[j]) {
				counter++;
				j++;
				k++;
				if (j >= numbers.length) {
					break;
				}
			}
			if (counter > maxSequence) {
				maxSequence = counter;
				index = i;
			}
			
		}
		
		for (int i = index; i <= index+maxSequence ; i++) {
			System.out.print(numbers[i] + " ");
		}
	
	}
	
}