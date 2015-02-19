import java.util.Scanner;


public class _08_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		if (number>0 && number<100) {
			factorial(number);
		}
		else {
			System.out.println("Error");
		}

	}
	
	public static void factorial(int number){
		
		long factorielN = 1;
		do
        {
            factorielN *= number;
            number--;
        } while (number > 0);
		
		System.out.println(factorielN);
	}

}
