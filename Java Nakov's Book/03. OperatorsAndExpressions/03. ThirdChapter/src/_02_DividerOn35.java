import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _02_DividerOn35 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(bf.readLine());
		if ((number % 5 == 0)&&(number % 7 == 0)) {
			System.out.printf("%1$d is divided on 35",number);
		}
		else {
			System.out.printf("%1$d in not divided on 35",number);
		}

	}

}
