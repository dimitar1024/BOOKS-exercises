import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _04_PrintNameOnDigit {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		switch (n) {
		case 0:
			System.out.println("Нула");
			break;
		case 1:
			System.out.println("Едно");
			break;
		case 2:
			System.out.println("Две");
			break;
		case 3:
			System.out.println("Три");
			break;
		case 4:
			System.out.println("Четири");
			break;
		case 5:
			System.out.println("Пет");
			break;
		case 6:
			System.out.println("Шест");
			break;
		case 7:
			System.out.println("Седем");
			break;
		case 8:
			System.out.println("Осем");
			break;
		case 9:
			System.out.println("Девет");
			break;

		
		}
		

	}

}
