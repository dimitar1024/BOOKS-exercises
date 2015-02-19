import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _03_CheckThirdNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(bf.readLine());
		int thirdNumber = (number/101)%10;
		if (thirdNumber == 7) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
