import java.util.Scanner;


public class _02_FindString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println("Enter word you are looking:");
		String word = sc.next();
		int count = 0;
		
		sc.close();
		int index = line.indexOf(word);
		while (index !=-1) {
			count++;
			index = line.indexOf(word, index+1);			
		}
		
		System.out.println(count);
	}

}