import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _13_BinaryToDecimal {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String bin = bf.readLine();
		int decimal = 0;
		
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '0') {
				continue;
			}
			decimal += Math.pow(2, i);
		}

		System.out.println(decimal);
	}

}
