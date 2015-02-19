import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _07_FactorialNKNK {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
        int k = Integer.parseInt(bf.readLine());
        long factorielN = 1;
        long factorielK = 1;
        long nMinusK = n - k;
        long factorielNminusK = 1;
        long result;
        if (k<n)
        {
            do
            {
                factorielN *= n;
                n--;
            } while (n>0);
            do
            {
                factorielK *= k;
                k--;
            } while (k>0);
            do
            {
                factorielNminusK *= nMinusK;
                nMinusK--;
            } while (nMinusK>0);
            result = (factorielN * factorielK) / factorielNminusK;
            System.out.println("N!*K!/(N-K)! = " + result);
        }
        
        else
        {
        	System.out.println("ERROR! Pleace new numbers");
        }

	}
}
