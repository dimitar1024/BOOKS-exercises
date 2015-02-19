import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _07_SumOfSumberIsZero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int f = Integer.parseInt(bf.readLine()); 
		int s = Integer.parseInt(bf.readLine()); 
		int t = Integer.parseInt(bf.readLine());
		
		if (f+s == 0) {
			System.out.printf("{%1$d, %2$d}",f,s);
			System.out.println();
		}
		if (s+t == 0) {
			System.out.printf("{%1$d, %2$d}",s,t);
			System.out.println();
		}
		if (f+t == 0) {
			System.out.printf("{%1$d, %2$d}",f,t);
			System.out.println();
		}

	}

}
