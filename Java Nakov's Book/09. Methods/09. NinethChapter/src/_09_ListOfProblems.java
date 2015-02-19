import java.util.Scanner;


public class _09_ListOfProblems {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("\"Reverse number\" please enter: 1");
		System.out.println("\"Average on array\" please enter: 2");
		System.out.println("\"Lineal equation\" please enter: 3");
		System.out.println("Pleace enter number of Problem: ");
		int problem = sc.nextInt();
		
		switch (problem) {
		case 1:
			System.out.println("Pleace enter number:");
			int number = sc.nextInt();
			reverseNumbers(number);
			break;
			
		case 2:
			
			break;
			
		case 3:
	
			break;

		default:
			break;
		}
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
