import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _05_RectangleArea {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double height = Double.parseDouble(bf.readLine());
		double width = Double.parseDouble(bf.readLine());
		
		double area = height*width;
		
		System.out.println("Area is: " + area);
		
	}

}
