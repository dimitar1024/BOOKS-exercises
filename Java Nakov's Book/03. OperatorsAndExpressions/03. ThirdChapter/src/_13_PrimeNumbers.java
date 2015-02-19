import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _13_PrimeNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		if ((n%2!=0)&&(n%3!=0)&&(n%5!=0)&&(n%11!=0)||(n==2)||(n==3)||(n==5)||(n==7)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
