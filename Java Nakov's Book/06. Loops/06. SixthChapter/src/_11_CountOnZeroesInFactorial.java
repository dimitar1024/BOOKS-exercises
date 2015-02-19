import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _11_CountOnZeroesInFactorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int count = 0;
        int divider = 5;

        while (n / divider >=1)
        {
            count += n / divider;
            divider *= 5;
        }
        System.out.printf("In %d! has %d trailing zeros", n, count);

	}

}
