import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _10_MatrixTo20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int row= 1; row <= n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(row+col + " ");
			}
			System.out.println();
		}
	}

}
