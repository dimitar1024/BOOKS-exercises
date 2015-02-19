
public class _01_ArrayFromOneTo20 {

	public static void main(String[] args) {
		int[] array = new int[20];
		
		for (int i = 1; i <= array.length; i++) {
			int newNumber = i*5;
			System.out.print(newNumber + " ");
		}

	}

}
