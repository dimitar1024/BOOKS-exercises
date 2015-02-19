import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _15_HexToDecimal {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String hex = bf.readLine();
		int number = 0;
		int power=1;
		for (int i = hex.length()-1; i>=0; i--) {
			int num;
            
            switch (hex.charAt(i))
            {
                case 'A': num = 10; break;
                case 'B': num = 11; break;
                case 'C': num = 12; break;
                case 'D': num = 13; break;
                case 'E': num = 14; break;
                case 'F': num = 15; break;
                default: num = (int)hex.charAt(i) - 48;
                    break;
            }
            number = number + (num * power);
            power = power * 16;
		}
		System.out.println(number);
	}

}
