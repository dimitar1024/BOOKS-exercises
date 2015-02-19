import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _01_PrintSumThreeNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int firstN = Integer.parseInt(bf.readLine());
		int secondN = Integer.parseInt(bf.readLine());
		int thirdN = Integer.parseInt(bf.readLine());
		
		int sum = firstN+secondN+thirdN;
		System.out.println("Sum on three numbers: " + sum);
	}

}
