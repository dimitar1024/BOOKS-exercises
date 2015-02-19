import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _08_CircleProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		int y = Integer.parseInt(bf.readLine());
		int stop = 5;
		
		double pitagor = Math.sqrt(x*x + y*y);
		if (pitagor <= stop) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
