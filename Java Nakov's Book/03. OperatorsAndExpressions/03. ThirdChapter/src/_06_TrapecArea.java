import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _06_TrapecArea {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double a = Double.parseDouble(bf.readLine());
		double b = Double.parseDouble(bf.readLine());
		double h = Double.parseDouble(bf.readLine());
		
		double area = (a+b)/2 * h;
		
		System.out.println("Area is: " + area);
	}

}
