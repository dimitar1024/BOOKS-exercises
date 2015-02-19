import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _03_GreaterAndSmallNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of integers");
		int n = Integer.parseInt(bf.readLine());
		int max = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(bf.readLine());
			if (i==0) {
				max = num;
				min = num;
			}
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
			
		}
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		

	}

}
