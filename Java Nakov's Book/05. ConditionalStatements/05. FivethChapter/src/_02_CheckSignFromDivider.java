import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _02_CheckSignFromDivider {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double first = Double.parseDouble(bf.readLine());
		double second = Double.parseDouble(bf.readLine());
		
		if ((first < 0)||(second < 0)) {
			System.out.println("(-)");
		}
		if ((first >= 0)&&(second >= 0)) {
			System.out.println("(+)");
		}
	}

}
