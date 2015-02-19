import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _04_BitCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(bf.readLine());
		int mask = 1<<3;
		int bit = number & mask;
		int result = bit >>3;
		
		System.out.println(result);
		
	}

}
