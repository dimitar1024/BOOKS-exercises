import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _02_CircleAreaAndPrameter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(bf.readLine());
		double area = Math.PI*r*r;
		double parameter = Math.PI*r*2;
		
		System.out.println("Area is: " + area);
		System.out.println("Parameter is: " + parameter);

	}

}
