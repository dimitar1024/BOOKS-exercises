import java.util.Scanner;


public class _07_ReverseNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		reverseNumbers(number);
	}
	
	public static void reverseNumbers(int number){
		String newNum = "";
		while (number>0) {
			int digit = number%10;
			number = number/10;
			newNum = newNum + digit;
		}
		
		System.out.println(newNum);
	}

}
