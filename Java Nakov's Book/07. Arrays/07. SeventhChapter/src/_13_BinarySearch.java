import java.util.Scanner;


public class _13_BinarySearch {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] nums = input.split(" ");
		int[] numbers = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			numbers[i] = Integer.parseInt(nums[i]);
		}
		int[] sort = sortArray(numbers);
		
		int find = sc.nextInt();
		BinarySearch(find,sort);
		

	}
	public static int[] sortArray(int[] arr){
		int min;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}
	
	public static void BinarySearch(int find,int[]arr){
		int startIndex =0;
		int endIndex = arr.length-1;
		int indexNow =0;
		
		indexNow = (startIndex + endIndex) /2;
		
		do {
			if (arr[indexNow] == find) {
				System.out.println(indexNow);
				return;
			}
			else if (arr[indexNow] > find) {
				endIndex = indexNow;
				indexNow = (startIndex + endIndex)/2;
			}
			else {
				startIndex = indexNow;
				indexNow = (startIndex + endIndex)/2;
			}
		} while (startIndex != endIndex);
		
		System.out.println("Not Found!");
	}

}
