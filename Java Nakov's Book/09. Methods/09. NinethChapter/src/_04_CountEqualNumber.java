import java.util.Scanner;


public class _04_CountEqualNumber {

	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		String[] numsToStr = input.split(" ");
		int[] numbers = new int[numsToStr.length];
		for (int i = 0; i < numsToStr.length; i++) {
			numbers[i] = Integer.parseInt(numsToStr[i]);
		}
		//..end input
		
		int[] sort = sort(numbers);
		getCountOfEqualNelenent(sort,n);
	}
	
	public static int[] sort(int[] numbers){
		int[] sort = numbers;
		int min;
		
		for (int i = 0; i < sort.length; i++) {
			min = i;
			for (int j = i+1; j < sort.length; j++) {
				if (numbers[j] < numbers[min]) {
					min = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;
		}
		return sort;
	}
	
	public static void getCountOfEqualNelenent(int[] arr,int n){
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == n) {
				counter++;
			}			
		}
		
		if (counter > 0) {
			System.out.println("element[" + n + "] => "+ counter + " times");
		}
		else {
			System.out.println("-1");
		}
		
	}

}
