import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _01_PrintNumberFrom1toN {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}
