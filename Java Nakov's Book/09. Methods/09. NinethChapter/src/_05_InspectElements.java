import java.util.Scanner;


public class _05_InspectElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int pos = sc.nextInt();
		sc.close();
		String[] numsToStr = input.split(" ");
		int[] numbers = new int[numsToStr.length];
		for (int i = 0; i < numsToStr.length; i++) {
			numbers[i] = Integer.parseInt(numsToStr[i]);
		}// End input

		inspectElement(numbers,pos);
		
	}
	
	public static void inspectElement(int[] arr, int pos){
		if ((arr[pos-1] > arr[pos])&&(arr[pos+1] > arr[pos])) {
			System.out.println("Element " + arr[pos] + " on position " + pos + " is smaller");
		}
		else if ((arr[pos-1] < arr[pos])&&(arr[pos+1] < arr[pos])) {
			System.out.println("Element " + arr[pos] + " on position " + pos + " is bigger");
		}
		else {
			System.out.println("Equl");
		}
		
	}

}