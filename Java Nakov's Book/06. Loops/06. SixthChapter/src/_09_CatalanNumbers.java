import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _09_CatalanNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(bf.readLine());
		long factorielN = 1;
        long ntwo = 2 * n;
        long factorielNtwo = 1;
        long nplus1 = n + 1;
        long factorielNplus1 = 1;
        long result;
        if (n>=0)
        {
            do
            {
                factorielN *= n;
                n--;
                
            } while (n > 0);

            do
            {
                factorielNtwo *= ntwo;
                ntwo--;
            } while (ntwo > 0);

            do
            {
                factorielNplus1 *= nplus1;
                nplus1--;
            } while (nplus1 > 0);

            result = (factorielNtwo / (factorielNplus1 * factorielN));

            System.out.println("(2n)!/((n+1)!n!) = "+ result);


        }

	}

}
