import java.util.Scanner;


public class _08_HexToBinary {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        
		String hex = sc.nextLine();
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
		
		String bin = "";
		int bit = 0;
		
		while (number>0) {
			bit = number%2;
			number = number/2;
			bin = bit + bin;
		}
		System.out.println(bin);

	}

}