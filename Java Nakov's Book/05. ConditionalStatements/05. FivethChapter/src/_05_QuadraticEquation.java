import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _05_QuadraticEquation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double a = Double.parseDouble(bf.readLine());
        double b = Double.parseDouble(bf.readLine());
        double c = Double.parseDouble(bf.readLine());
        double disc = b * b - (4 * a * c);
        if (disc < 0)
        {
            System.out.println("no real roots");
        }
        if (disc == 0)
        {
            double result = -b / 2 * a;
            System.out.println("x1=x2=" + result);
        }
        if (disc > 0)
        {
            double sqrtDisc =Math.sqrt(disc);
            double x1 = (-b - sqrtDisc) / (2 * a);
            double x2 = (-b + sqrtDisc) / (2 * a);
            System.out.printf("x1=%1$f; x2=%2$f",x1,x2);
        }

	}

}
