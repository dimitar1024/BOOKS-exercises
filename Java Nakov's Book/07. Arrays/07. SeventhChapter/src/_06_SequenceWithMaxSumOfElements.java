import java.util.Scanner;


public class _06_SequenceWithMaxSumOfElements {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int sumNow = 0;
		int index = 0;
		int maxSum =0;
		int countElements = 1;
		
		for (int i = 0; i <= n-k; i++) {
			int j = i;
			for (; j < i+k; j++) {
				sumNow += numbers[j];
			}
			if (sumNow > maxSum) {
				maxSum = sumNow;
				index = i;
				countElements = j-i;
			}
			sumNow =0;
		}

		for (int i = index; i < index + countElements; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
