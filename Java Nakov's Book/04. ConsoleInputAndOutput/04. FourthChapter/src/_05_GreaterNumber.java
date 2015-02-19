import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _05_GreaterNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		
		int greater = (a+b+ Math.abs(a-b))/2;
		
		System.out.println(greater);
	}

}
