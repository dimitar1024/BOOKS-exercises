import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _08_BonusScore {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		switch (n) {
		case 1:
		case 2:
		case 3:
			System.out.println(n*10);
			break;
		case 4:
		case 5:
		case 6:
			System.out.println(n*100);
			break;
		case 7:
		case 8:
		case 9:
			System.out.println(n*1000);
			break;

		}
	}

}
