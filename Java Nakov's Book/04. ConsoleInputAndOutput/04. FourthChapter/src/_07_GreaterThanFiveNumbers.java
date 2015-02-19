import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _07_GreaterThanFiveNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int greater = 0;
		for (int i = 0; i < 5; i++) {
			int n = Integer.parseInt(bf.readLine());
			if (greater < n) {
				greater = n;
			}
		}
		
		System.out.println(greater);

	}

}
