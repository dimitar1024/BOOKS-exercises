import java.util.Scanner;


public class _07_SelectionSort {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int min;
		
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i+1; j < n; j++) {
				if (numbers[j] < numbers[min]) {
					min = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(numbers[i] + " ");
		}
	}

}
