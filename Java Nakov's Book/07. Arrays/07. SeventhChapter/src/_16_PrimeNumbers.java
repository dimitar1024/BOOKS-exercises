
public class _16_PrimeNumbers {

	public static void main(String[] args) {
		int NUM = 10000000;

		boolean[] flag = new boolean[NUM];
		
		for (int i = 2; i < NUM; i++) {
			flag[i] = true;
		}
		
		for (int i = 2; i < NUM; i++) {
			if (flag[i] ==true) {
				int j = i+1;
				while (j < NUM) {
					if (j % i ==0) {
						flag[i] = false;
					}
					j++;
				}
				
			}
		}
		
		for (int i = 2; i < NUM; i++) {
			if (flag[i] == true) {
				System.out.print(i + " ");
			}
		}
	}

}
