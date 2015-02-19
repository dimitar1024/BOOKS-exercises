import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _08_FactorialWithXOnPower {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
        int x = Integer.parseInt(bf.readLine());
        
        float sum = 1;
        float factorial = 1;
        int power = x;
        for (int count = 1; count <= n; count++)
        {
            factorial *= count;
            sum += factorial / x;
            x *= power;
        }
        System.out.printf("%.5f", sum);
	}

}
