import java.util.Scanner;


public class _10_MatrixProgram {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int[][] matrixA = MatixFromA(number);
		PrintMatrix(matrixA);
		
		System.out.println();
		
		int[][] matrixB = MatixFromB(number);
		PrintMatrix(matrixB);
		
	}
	
	public static int[][] MatixFromA(int n){
		// up-down => up-down => up-down => up-down;
		int[][] matrix= new int[n][n];
		matrix[0][0] = 1;
		for (int i = 1; i < matrix.length; i++) {
			matrix[0][i] = matrix[0][i-1] + n;
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = matrix[i-1][j] + 1;
			}
		}
		
		return matrix;
	}
	
	
	
	public static int[][] MatixFromB(int n){
		// up-down => down-up => up-down => down-up;
		int[][] matrix= new int[n][n];
		matrix[0][0] = 1;
		for (int i = 1; i < matrix.length; i++) {
			if (i % 2 == 1) {
				matrix[0][i] = matrix[0][i-1] + n*2-1;
			}
			else {
				matrix[0][i] = matrix[0][i-1] + 1; 
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (j%2 ==1) {
					matrix[i][j] = matrix[i-1][j] - 1;
				}
				else {
					matrix[i][j] = matrix[i-1][j] + 1;
				}
			}
		}
		
		return matrix;
	}
	
	
	
	
	
	
	
	public static void PrintMatrix(int[][] matrix){
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%4d",matrix[row][col]);
			}
			System.out.println();
		}
	}
	// Matricite ne sa dovar6eni c i d podto4ki. At Now no Time :)
}