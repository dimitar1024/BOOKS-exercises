import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _11_CheckBitOnPositionP {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int p = Integer.parseInt(bf.readLine());
		int mask = 1<<p;
		int bit = n & mask;
		int result = bit>>p;
		System.out.println(result);
	}

}
