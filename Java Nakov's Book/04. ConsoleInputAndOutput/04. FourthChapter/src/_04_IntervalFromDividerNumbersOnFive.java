import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _04_IntervalFromDividerNumbersOnFive {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int start = Integer.parseInt(bf.readLine());
		int end = Integer.parseInt(bf.readLine());
		int counter = 0;
		
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0) {
				counter++;
			}
		}
		
		System.out.println(counter);
		

	}

}
