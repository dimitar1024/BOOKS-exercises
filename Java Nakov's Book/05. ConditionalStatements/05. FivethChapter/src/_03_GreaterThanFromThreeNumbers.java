import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _03_GreaterThanFromThreeNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int greater = 0;
		for (int i = 0; i < 3; i++) {
			int number = Integer.parseInt(bf.readLine());
			if (number > greater) {
				greater = number; 
			}
		}
		System.out.println(greater);
	}

}
