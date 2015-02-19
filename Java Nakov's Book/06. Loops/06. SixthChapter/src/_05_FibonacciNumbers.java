import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _05_FibonacciNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int first = 0;
		int second = 1;
		int next = first + second;
		int sum = 0;
		int n = Integer.parseInt(bf.readLine());
		if (n==1) {
			sum = first;
			System.out.println(sum);
		}
		if (n==2) {
			sum = first + second;
			System.out.println(sum);
		}
		if (n==3) {
			sum = first + second + next;
			System.out.println(next);
		}
		if (n>3) {
			for (int i = 4; i <= n; i++) {
				sum = first + second + next;
				first = next;
				second = first;
				next = first + second;
				sum+=next;
				
			}
			System.out.println(sum);
			
		}
		
	}

}
