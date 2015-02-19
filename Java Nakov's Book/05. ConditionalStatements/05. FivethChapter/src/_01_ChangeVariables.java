import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _01_ChangeVariables {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int first = Integer.parseInt(bf.readLine());
		int second = Integer.parseInt(bf.readLine());
		
		if (first > second) {
			int change = second;
			second = first;
			first = change;
			
			System.out.println(first);
			System.out.println(second);
		}
		else {
			System.out.println(first);
			System.out.println(second);
		}
	}

}
