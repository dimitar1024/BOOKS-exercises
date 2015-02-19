import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _10_TwoVariables {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(bf.readLine());
		int second = Integer.parseInt(bf.readLine());
		int convert = 0;
		
		convert = second;
		second = first;
		first = convert;
		
		System.out.println(first);
		System.out.println(second);
	}
}
