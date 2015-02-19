import java.util.Scanner;


public class _01_PrintNameMethod {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		printGreating(name);
	}
	
	public static void printGreating(String name){
		System.out.println("Hello, " + name + "!");
	}

}
