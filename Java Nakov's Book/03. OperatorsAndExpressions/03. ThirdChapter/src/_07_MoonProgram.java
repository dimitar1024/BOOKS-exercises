import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _07_MoonProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double weight = Double.parseDouble(bf.readLine());
		double moonWeight = weight * 0.17d;
		
		System.out.println(moonWeight);
	}

}
